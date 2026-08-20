# Network Layer

## What is Network Layer?

The **Network Layer** is responsible for **logical addressing, routing, and packet delivery**. It helps determine the path that data packets should take from the source device to the destination device, even when the devices are on different networks.

The two important protocols in the Network Layer are **IPv4 and IPv6**.

### IPv4

**IPv4 (Internet Protocol version 4)** uses **32-bit addresses** to uniquely identify devices on a network.

Example:

```text
192.168.1.10
An IPv4 address contains 4 octets, and each octet ranges from 0 to 255.

IPv4 provides approximately 4.3 billion possible addresses.

IPv6

IPv6 (Internet Protocol version 6) uses 128-bit addresses to provide a much larger address space.

Example:

2001:0db8:85a3::8a2e:0370:7334

IPv6 was introduced mainly to overcome the limited address space of IPv4 and support the growing number of internet-connected devices.

Routing

Routing is the process of finding a path for packets from the source to the destination.

Routers use IP addresses to decide where packets should be forwarded.

Source Device
      ↓
   Router
      ↓
   Router
      ↓
Destination Device
IP Address

An IP address is a logical address assigned to a device or network interface. It helps identify the source and destination of packets.

In Simple Terms
Source Device
      ↓
IPv4 / IPv6 Address
      ↓
Routing
      ↓
Routers
      ↓
Destination Device

The Network Layer mainly handles IP addressing and routing, allowing packets to travel between different networks.
