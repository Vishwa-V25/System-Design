# Transport Layer

## What is Transport Layer?

The **Transport Layer** is responsible for providing **end-to-end communication between applications** running on different devices. It controls how data is delivered from the source application to the destination application.

The two important protocols in the Transport Layer are **TCP and UDP**.

### TCP

**TCP (Transmission Control Protocol)** is a connection-oriented and reliable transport protocol. It ensures that data is delivered reliably and in the correct order. If data is lost during transmission, TCP can retransmit it.

Before transferring data, TCP establishes a connection using the **3-Way Handshake**.

```text
Client                  Server

   SYN  ───────────────>
        <──────────── SYN + ACK
   ACK  ───────────────>
When HTTP/HTTPS uses TCP, the TCP connection is established before HTTP/HTTPS data is transferred.

UDP

UDP (User Datagram Protocol) is a connectionless transport protocol. It sends data without establishing a connection first.

UDP does not guarantee delivery, ordering, or retransmission. It has less overhead and is useful when speed and low latency are more important than guaranteed delivery.

Used for: DNS, online gaming, video/audio streaming, VoIP, and DHCP.
