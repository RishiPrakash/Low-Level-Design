package OOD.RateLimiter.LeakyBucketFactory;

import OOD.RateLimiter.LeakyBucketConfigPrototypeRepository.LeakyBucketThrottleConfig;

public class LeakyBucketThrottleInfo {


    private LeakyBucketThrottleConfig leakyBucketThrottleConfig;
    private long left ;
    private long lastInjectionTime ;

    public long getLastInjectionTime() {
        return lastInjectionTime;
    }

    public void setLastInjectionTime(long lastInjectionTime) {
        this.lastInjectionTime = lastInjectionTime;
    }


    public LeakyBucketThrottleConfig getLeakyBucketThrottleConfig() {
        return leakyBucketThrottleConfig;
    }

    public long getLeft() {
        return left;
    }

    public void setLeft(long left) {
        this.left = left;
    }


    public static class LeakyBucketBuilder {
        LeakyBucketThrottleConfig leakyBucketThrottleConfig;

        public LeakyBucketBuilder withConfig(LeakyBucketThrottleConfig leakyBucketThrottleConfig) {
            this.leakyBucketThrottleConfig = leakyBucketThrottleConfig;
            return this;
        }

        public LeakyBucketThrottleInfo build() {
            LeakyBucketThrottleInfo leakyBucketThrottleInfo = new LeakyBucketThrottleInfo();
            leakyBucketThrottleInfo.leakyBucketThrottleConfig = this.leakyBucketThrottleConfig;
            return leakyBucketThrottleInfo;
        }
    }
}
