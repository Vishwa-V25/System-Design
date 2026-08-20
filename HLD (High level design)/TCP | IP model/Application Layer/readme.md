# Application Layer

## What is Application Layer?

The **Application Layer** is the top layer of the TCP/IP model. It provides **network communication services to applications** and defines how applications communicate with servers or other applications.

The important components of the Application Layer are **HTTP, HTTPS, TLS, WebSocket, Webhook, and REST API**.

### HTTP

**HTTP (HyperText Transfer Protocol)** is used for communication between a client and a server using a request-response model.

```text
Client → Request → Server
Client ← Response ← Server
HTTPS

HTTPS (HTTP Secure) is the secure version of HTTP.

HTTPS = HTTP + TLS

It protects communication using encryption, authentication, and data integrity.

When HTTPS uses TCP, the TCP connection is established first, followed by TLS and HTTPS communication.

TLS

TLS (Transport Layer Security) is a security protocol that protects data during communication.

It provides:

Encryption
Authentication
Data integrity
WebSocket

WebSocket provides a persistent, two-way communication channel between a client and server.

Client ←────────→ Server

Both the client and server can send data at any time.

Used for: Chat applications, online gaming, live notifications, and real-time applications.

Webhook

A Webhook allows one system to automatically send an HTTP request to another system when a specific event occurs.

Event Occurs
     ↓
System
     ↓
HTTP Request
     ↓
Another Server

Example: A payment service sends a notification to your server when a payment is successful.

REST API

REST (Representational State Transfer) is an architectural style used to design APIs.

REST APIs commonly use HTTP methods to work with resources.

GET     /users
POST    /users
PUT     /users/10
PATCH   /users/10
DELETE  /users/10

REST is an architectural style, not a protocol.
