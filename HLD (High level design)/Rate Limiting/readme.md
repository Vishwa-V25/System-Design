# Rate Limiting

**Rate Limiting** controls how many requests a user/client can send to a system within a specific time period.

A **Rate Limiter** checks each request and either **allows or rejects** it.

```text
Client
   ↓
Rate Limiter
   ↓
Allowed? → Yes → Server
         → No  → 429 Too Many Requests
Where is Rate Limiting Used?

Usually used at the API Gateway or Backend Service.

Client
   ↓
API Gateway
   ↓
Rate Limiter
   ↓
Backend Servers
   ↓
Database
Common Use Cases
Login / OTP APIs
Payment APIs
Public APIs
Search APIs
Social media APIs
Benefits
Prevents server overload
Prevents API abuse and brute-force attacks
Ensures fair resource usage
Protects CPU, memory, and database
Improves system availability
Types of Rate Limiting
1. Fixed Window

Allows a fixed number of requests in a fixed time period.

Example: 5 requests per minute.

10:00 ───────── 10:01

1 ✅
2 ✅
3 ✅
4 ✅
5 ✅
6 ❌

10:01 → Counter resets

Real-world: 5 people allowed to enter a theatre every hour.

Technology: Redis Counter + TTL

Think: 🕐 "Count requests in this fixed time."

2. Sliding Window

Checks requests made in the last X seconds/minutes continuously.

Example: 5 requests in the last 60 seconds.

10:00:10 → Request 1
10:00:20 → Request 2
10:00:30 → Request 3
10:00:40 → Request 4
10:00:50 → Request 5
                 ↓
              Request 6 ❌

After 60 seconds, old requests are removed from the window.

Real-world: Only 5 people can enter in any 60-second period.

Technology: Redis Sorted Set / Sliding Counter

Think: 👀 "Check the last 60 seconds."

3. Token Bucket

Requests need a token to be allowed.

Bucket = 5 tokens

🪙 🪙 🪙 🪙 🪙

Request → Token → ✅
Request → Token → ✅

No Token → ❌

Tokens are added again over time.

Real-world: You have 5 parking tokens. Use them whenever you want, but new tokens arrive slowly.

Technology: Redis, API Gateway, Bucket4j

Main benefit: Allows controlled bursts.

Think: 🪙 "Token available → Allow."

4. Leaky Bucket

Requests are placed in a queue and processed at a fixed rate.

Requests
 ↓ ↓ ↓ ↓ ↓
┌─────────┐
│ R R R R │
│ R R     │
└────┬────┘
     ↓
  Fixed Rate
     ↓
   Server

Example: Server processes only 2 requests/second.

Real-world: 100 cars arrive at a car wash, but only 2 cars are processed per minute.

Technology: Redis, NGINX, API Gateway, Message Queue

Main benefit: Smooths traffic.

Think: 💧 "Queue → Process at fixed speed."
