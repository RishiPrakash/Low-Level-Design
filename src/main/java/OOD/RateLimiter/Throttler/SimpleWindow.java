package OOD.RateLimiter.Throttler;

public class SimpleWindow implements  IThrottler{

    @Override
    public boolean tryAcquire(String key) {
        /**
         * Variant of throttler
         */
        return false;
    }
}
