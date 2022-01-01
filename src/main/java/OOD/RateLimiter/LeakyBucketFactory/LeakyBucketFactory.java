package OOD.RateLimiter.LeakyBucketFactory;

import OOD.RateLimiter.LeakyBucketConfigPrototypeRepository.LeakyBucketThrottleConfig;
import OOD.RateLimiter.LeakyBucketConfigPrototypeRepository.LeakyBucketPrototypeRegistry;

public class LeakyBucketFactory {
    LeakyBucketPrototypeRegistry leakyBucketPrototypeRegistry;
    public LeakyBucketFactory(LeakyBucketPrototypeRegistry leakyBucketPrototypeRegistry){
        this.leakyBucketPrototypeRegistry = leakyBucketPrototypeRegistry;
    }
    public LeakyBucketThrottleInfo getLeakyBucketThrottleInfo(String key){
        LeakyBucketThrottleConfig config = leakyBucketPrototypeRegistry.getConfig(key);
        return new LeakyBucketThrottleInfo.LeakyBucketBuilder().withConfig(config).build();
    }
}
