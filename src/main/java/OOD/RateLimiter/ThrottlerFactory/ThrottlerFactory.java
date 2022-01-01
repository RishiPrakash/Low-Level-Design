package OOD.RateLimiter.ThrottlerFactory;

import OOD.RateLimiter.CentralisedCache.LeakyBucketCache;
import OOD.RateLimiter.LeakyBucketConfigPrototypeRepository.LeakyBucketPrototypeRegistry;
import OOD.RateLimiter.LeakyBucketFactory.LeakyBucketFactory;
import OOD.RateLimiter.Throttler.IThrottler;
import OOD.RateLimiter.Throttler.LeakyBucket;

public class ThrottlerFactory {
    public IThrottler getThrottler(String name){
        if(ThrottlerType.LEAKYBUCKET.toString().equalsIgnoreCase(name)){
            LeakyBucketPrototypeRegistry leakyBucketPrototypeRegistry = new LeakyBucketPrototypeRegistry();
            LeakyBucketFactory leakyBucketFactory = new LeakyBucketFactory(leakyBucketPrototypeRegistry);
            LeakyBucketCache leakyBucketCache = new LeakyBucketCache();
            return  new LeakyBucket(leakyBucketFactory, leakyBucketCache);
        }else if(ThrottlerType.SINGLEWIDOW.toString().equalsIgnoreCase(name)){
            /**
             * Create relevant class
             *
             */
        }
        return null;
    }
}
