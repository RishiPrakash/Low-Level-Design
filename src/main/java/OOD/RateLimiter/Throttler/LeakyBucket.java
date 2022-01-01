package OOD.RateLimiter.Throttler;

import OOD.RateLimiter.CentralisedCache.LeakyBucketCache;
import OOD.RateLimiter.LeakyBucketFactory.LeakyBucketThrottleInfo;
import OOD.RateLimiter.Exception.RecordNotFoundException;
import OOD.RateLimiter.LeakyBucketFactory.LeakyBucketFactory;

public class LeakyBucket implements IThrottler{
    LeakyBucketFactory leakyBucketFactory;
    LeakyBucketCache leakyBucketCache;
    public LeakyBucket(LeakyBucketFactory leakyBucketFactory, LeakyBucketCache leakyBucketCache){
        this.leakyBucketFactory = leakyBucketFactory;
        this.leakyBucketCache = leakyBucketCache;
    }

    @Override
    public boolean tryAcquire(String key) {
        synchronized(LeakyBucket.class){
            LeakyBucketThrottleInfo metaInfo = getMetaInfo(key);
            long now  = System.currentTimeMillis();
            double velocity = metaInfo.getLeakyBucketThrottleConfig().getVelocity();
            long lastInjectionTime = metaInfo.getLastInjectionTime();
            long left = metaInfo.getLeft();
            long capacity  = metaInfo.getLeakyBucketThrottleConfig().getCapacity();
            left  = Math.max(0, left - (long)((now- lastInjectionTime)*velocity*1000));

            if(left+1>capacity){
                System.out.println("Not able to acquire at: "+now);
                return false;
            }
            System.out.println("Able to acquire at: "+now);
            updateCache(key, metaInfo, left+1, now);
            return true;
        }
    }
    private LeakyBucketThrottleInfo updateCache(String key, LeakyBucketThrottleInfo leakyBucketThrottleInfo, long left, long now){
        leakyBucketThrottleInfo.setLeft(left);
        leakyBucketThrottleInfo.setLastInjectionTime(now);
        return leakyBucketCache.setMetaInfo(key, leakyBucketThrottleInfo);
    }
    private LeakyBucketThrottleInfo getMetaInfo(String key){
        LeakyBucketThrottleInfo metaInfo = null;
        try{
            metaInfo = leakyBucketCache.getMetaInfo(key);
        }catch (RecordNotFoundException e){
            metaInfo = leakyBucketFactory.getLeakyBucketThrottleInfo(key);
        }
        return metaInfo;
    }
}
