package OOD.RateLimiter.LeakyBucketConfigPrototypeRepository;

public class LeakyBucketThrottleConfig {
    private final long capacity;
    private final long windowTime;
    private final double velocity;
    public LeakyBucketThrottleConfig(long capacity, long windowTime) {
        this.capacity = capacity;
        this.windowTime = windowTime;
        this.velocity = (double)capacity/(double)windowTime;
    }

    public long getCapacity() {
        return capacity;
    }

    public long getWindowTime() {
        return windowTime;
    }

    public double getVelocity() {
        return velocity;
    }


}
