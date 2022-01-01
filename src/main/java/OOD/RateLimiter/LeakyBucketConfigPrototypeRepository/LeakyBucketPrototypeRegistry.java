package OOD.RateLimiter.LeakyBucketConfigPrototypeRepository;

import java.util.HashMap;
import java.util.Map;

public class LeakyBucketPrototypeRegistry {
    Map<String, LeakyBucketThrottleConfig> registry = new HashMap<>();
    public LeakyBucketPrototypeRegistry(){
        load();
    }
    private void load(){
        /**
         * From Database we are preparing this config at the run time for all of our
         * registered customers
         */
        registry.put("A", new LeakyBucketThrottleConfig(3,10000));
        registry.put("B", new LeakyBucketThrottleConfig(20,10));
        registry.put("C", new LeakyBucketThrottleConfig(30,10));
    }
     public LeakyBucketThrottleConfig addNewCustomer(String apiKey, long capacity, long windowInteral){
         return registry.put(apiKey, new LeakyBucketThrottleConfig(capacity, windowInteral));
     }
    public LeakyBucketThrottleConfig removeCustomer(String apiKey){
        return registry.remove(apiKey);
    }
    public  LeakyBucketThrottleConfig getConfig(String apiKey){
       return registry.get(apiKey);
    }

}
