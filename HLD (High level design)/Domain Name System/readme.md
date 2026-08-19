# DNS, Domain Name & IP Address

## 1. Domain Name

A **domain name** is a human-readable name used to identify a website or service.

Instead of remembering an IP address like:

```text
142.250.195.14
```

we use:

```text
google.com
```

**Example:**

```text
google.com
github.com
amazon.com
```

---

## 2. DNS — Domain Name System

**DNS converts a domain name into its corresponding IP address.**

```text
Client
   ↓
google.com
   ↓
DNS
   ↓
142.250.x.x
   ↓
Google Server
```

DNS works like the **phonebook of the Internet**.

### Why DNS?

Humans can easily remember:

```text
google.com
```

but computers communicate using:

```text
IP Address
```

So DNS connects the two.

---

## 3. IP Address

An **IP (Internet Protocol) address** uniquely identifies a device or network interface so that data can be delivered to the correct destination.

There are two major versions:

### IPv4

IPv4 uses **32 bits** and is written as four decimal numbers.

```text
192.168.1.10
```

Range of each part:

```text
0 – 255
```

Example:

```text
8.8.8.8
```

IPv4 provides approximately **4.3 billion addresses**.

---

### IPv6

IPv6 uses **128 bits** and was introduced because IPv4 addresses are limited.

Example:

```text
2001:4860:4860::8888
```

IPv6 provides a **vastly larger address space** than IPv4.

---

## IPv4 vs IPv6

| Feature       | IPv4          | IPv6          |
| ------------- | ------------- | ------------- |
| Address size  | 32-bit        | 128-bit       |
| Example       | `192.168.1.1` | `2001:db8::1` |
| Address space | ~4.3 billion  | ~3.4 × 10³⁸   |
| Format        | Decimal       | Hexadecimal   |

---

## 🔑 Complete Flow

When you enter:

```text
https://example.com
```

the basic process is:

```text
Domain Name
     ↓
    DNS
     ↓
IP Address
     ↓
Server
     ↓
Response
```

### Remember

> **Domain = Human-readable name**
> **DNS = Converts domain → IP**
> **IP = Identifies the destination**
