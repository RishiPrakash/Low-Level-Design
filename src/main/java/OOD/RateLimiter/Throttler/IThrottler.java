package OOD.RateLimiter.Throttler;


public interface IThrottler {
    boolean tryAcquire(String key);
}
