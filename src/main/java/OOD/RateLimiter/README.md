Client has a choice to choose from 
1. LEAKY BUCKET
2. SLIDING WINDOW
3. FIXED WINDOW

I have implemented just LEAKY BUCKET.

Throttler Factory returns an object of IThrottler type.

`in Leaky Bukcet`
To handle multiple clients, we assume we are keeping
information about each client limiting details, in database
which we can fetch from database to repository in LeakyBucketPrototypeRegistry.

From this registry, we get LeakyBucketThrottleConfig, which contains those details which are configurable/Kept in DB.
Using this config, we create a LeakyBucketThrottleInfo for each API key, we get request for (on it's first time).

We also have a centralised cache, which keeps APIKey <> LeakyBucket Throttling Info Object.

The  flow is like following 
Client->ThrottlerFactory->LeakyBucket Throttler Method->Generated LeakyBucket Class which has -> LeakyBucket Cache + Leaky Bucket Factory(Generate Leaky Bucket Throttle Info for each API Key/Customer)
->which requires Leaky Bucket Registry(Loaded from Database)->throttler Object

Client->throttler.tryAcquire (First time) -> generates a new LeakyBucket Throttle info object out of LeakyBucket Facotory and run tryAcquire
, save it in centralised Cache.

Client->throttler.tryAcquire(Second+ time) ->get older saved information from centralised cache -> run tryAcquire
```
_This LeakyBucket Throttle Info is required by Leaky Bucket class to do computation.

After first time, LeakyBucket class object is saved in centralised Cache and is retrieved from there.```_

