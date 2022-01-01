package OOD.RateLimiter;

import OOD.RateLimiter.CentralisedCache.LeakyBucketCache;
import OOD.RateLimiter.LeakyBucketConfigPrototypeRepository.LeakyBucketPrototypeRegistry;
import OOD.RateLimiter.LeakyBucketFactory.LeakyBucketFactory;
import OOD.RateLimiter.Throttler.IThrottler;
import OOD.RateLimiter.Throttler.LeakyBucket;
import OOD.RateLimiter.ThrottlerFactory.ThrottlerFactory;
import OOD.RateLimiter.ThrottlerFactory.ThrottlerType;

public class Client {
    public static void main(String[] args) {
        IThrottler throttler = new ThrottlerFactory().getThrottler(ThrottlerType.LEAKYBUCKET.toString());
        throttler.tryAcquire("A");
        throttler.tryAcquire("A");
        throttler.tryAcquire("A");
        throttler.tryAcquire("A");
        throttler.tryAcquire("A");
    }
}
