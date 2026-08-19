# Client-Server Architecture

Client-Server Architecture is a model where a **client requests data or a service**, and a **server processes the request and sends back a response**.

### Basic Flow

```text
Client → Request → Server
Client ← Response ← Server
```

A device or application is **not permanently a client or server**. The same system can act as a client for one service and a server for another.

---

## Types of Clients

### 1. Thin Client

A **thin client** performs very little processing and depends mainly on the server.

```text
Client → Request → Server
Client ← Data ← Server
```

**Example:** Web browser accessing a web application.

### 2. Thick Client

A **thick client** performs some processing or computation locally before or after communicating with the server.

```text
Client
  ↓
Local Processing
  ↓
Request → Server
  ↓
Response
  ↓
Local Processing
```

**Example:** Desktop applications that perform calculations locally while using a server for data.

---

## Types of Client-Server Architecture

### 2-Tier Architecture

In a 2-tier architecture, the system has two main tiers:

```text
Client
   ↓
Server
```

The client communicates directly with the server.

**Example:**

```text
Application → Database Server
```

---

### N-Tier Architecture

In an N-tier architecture, the application is divided into multiple logical tiers.

```text
Client
   ↓
Web / Presentation Server
   ↓
Application / Business Server
   ↓
Database Server
```

For example, a 3-tier application contains:

1. **Presentation Tier** – User interface
2. **Application Tier** – Business logic
3. **Data Tier** – Database

N-tier architecture improves **scalability, maintainability, and separation of responsibilities**.

---

## Client-Server Relationship

A system can act as both a client and a server depending on the communication.

```text
Application A
     ↓
   Client
     ↓
Application B
     ↓
   Server

Application B
     ↓
   Client
     ↓
Database
     ↓
   Server
```

So, **client and server are roles, not permanent identities**.

---

## DNS

When a client wants to communicate with a server using a domain name, **DNS (Domain Name System)** helps resolve the domain name to the corresponding IP address.

```text
Client
   ↓
DNS Lookup
   ↓
IP Address
   ↓
Server
```

**DNS will be covered in the next topic.**
