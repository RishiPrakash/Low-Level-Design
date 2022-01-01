Client has a choice to choose from 
1. LEAKY BUCKET
2. SLIDING WINDOW
3. FIXED WINDOW

I have implemented just LEAKY BUCKET.

Factory returns an object of IThrottler type.

`in Leaky Bukcet`
To handle multiple clients, we assume we are keeping
information about each client limiting details, in database
which we can fetch from database to repository in LeakyBucketPrototypeRegistry.

For this registry, we get LeakyBucketThrottleConfig, which contains those details which are configurable.
Using this config, we create a LeakyBucketThrottleInfo for each API key, we get request for (on it's first time).

We also have a centralised cache, which keeps APIKey <> LeakyBucket Throttling Info Object.

The control flow is like following 
Client->Factory->LeakyBucket Throttler Method->LeakyBucket Class -> LeakyBucket Cache + Leaky Bucket Factory(Generate Leaky Bucket Throttle Info for each API Key)
->Leaky Bucket Registry(Loaded from Database)
-> returns LeakyBucket Throttle Info
This LeakyBucket Throttle Info is required by Leaky Bucket class to do computation.

After first time, LeakyBucket class object is saved in centralised Cache and is retrieved from there.

