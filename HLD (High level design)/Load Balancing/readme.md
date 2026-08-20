# Load Balancer

## What is a Load Balancer?

A **Load Balancer** is a system that distributes incoming client requests across multiple servers.

It helps improve **performance, availability, scalability, and reliability** by preventing a single server from receiving all the traffic.

Types of Load Balancing

Load balancing methods can be broadly classified into:

Static Load Balancing

Dynamic Load Balancing

1. Static Load Balancing

In Static Load Balancing, the load balancer distributes requests based on predefined rules.

It does not consider the current load or performance of the servers.

Round Robin

Requests are distributed one by one in a fixed order among the servers.

Request 1 → Server 1
Request 2 → Server 2
Request 3 → Server 3
Request 4 → Server 1
Weighted Round Robin

Each server is assigned a weight based on its capacity.

A server with a higher weight receives more requests.

Server 1 → Weight 3
Server 2 → Weight 2
Server 3 → Weight 1

Server 1 receives more requests than Server 2 and Server 3.

2. Dynamic Load Balancing

In Dynamic Load Balancing, the load balancer considers the current condition of the servers before sending a request.

It can consider factors such as connections, response time, and server capacity.

Least Response Time

The request is sent to the server that currently has the lowest response time.

Server 1 → 200 ms
Server 2 → 100 ms  ← Request
Server 3 → 300 ms

Server 2 receives the request because it has the lowest response time.

Least Connection

The request is sent to the server with the fewest active connections.

Server 1 → 10 connections
Server 2 → 5 connections   ← Request
Server 3 → 8 connections

Server 2 receives the request.

Weighted Least Connection

This combines server capacity (weight) with the number of active connections.

Servers with higher capacity can handle more connections, so the load balancer considers both the server's weight and its current connections.

Server 1 → Weight: 5 → 10 connections
Server 2 → Weight: 2 →  3 connections
Server 3 → Weight: 1 →  2 connections

The load balancer selects the server based on the connection load relative to its assigned weight.


