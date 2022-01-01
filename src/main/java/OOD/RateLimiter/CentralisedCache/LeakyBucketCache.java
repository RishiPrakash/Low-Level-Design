package OOD.RateLimiter.CentralisedCache;

import OOD.RateLimiter.Exception.RecordNotFoundException;
import OOD.RateLimiter.LeakyBucketFactory.LeakyBucketThrottleInfo;

import java.util.concurrent.ConcurrentHashMap;

public class LeakyBucketCache {
    ConcurrentHashMap<String, LeakyBucketThrottleInfo> registry = new ConcurrentHashMap<>();

    public LeakyBucketThrottleInfo getMetaInfo(String key){
        if(!registry.containsKey(key)){
            throw new RecordNotFoundException("Record for this key does not exist");
        }
        return registry.get(key);
    }
    public LeakyBucketThrottleInfo setMetaInfo(String key, LeakyBucketThrottleInfo LeakyBucketThrottleInfo){
       return  registry.put(key, LeakyBucketThrottleInfo);
    }
}
