Ports are identified with positive 16-bit unsigned integers, ranging from 0 to 65535.

Port Categories
1. **Well-Known Ports (0 – 1023)**:
   - These are the **system ports** or **well-known ports**.
   - They range from **0 to 1023**.
   - System processes use these ports to provide widely used types of network services.
   - Examples include:
     - **HTTP (port 80)** for web traffic.
     - **SMTP (port 25)** for email communication.
     - **POP3 (port 110)** for retrieving email from a server.
     - **FTP (port 21)** for file transfers.
     - **DNS (port 53)** for domain name resolution

2. **Registered Ports (1024 – 49151)**:
   - These ports fall within the range of **1024 to 49151**.
   - They are **reserved** for specific applications but are not as universally recognized as well-known ports.
   - Various services utilize these registered ports for communication.
   - For instance, some custom applications or protocols might use specific registered ports.

3. **Dynamic Ports (49152 – 65535)**:
   - The dynamic or private ports span from **49152 to 65535**.
   - These ports are **not officially assigned** by any standard organization.
   - They are dynamically allocated by the operating system for temporary use.
   - When an application needs a port, the OS assigns an available dynamic port for that purpose.


some well-known ports

| Port Number | Usage |
| ---- | ---- |
| 20 | File Transfer Protocol (FTP) Data Transfer |
| 21 | File Transfer Protocol (FTP) Command Control |
| 22 | Secure Shell (SSH) |
| 23 | Telnet - Remote login service, unencrypted text messages |
| 25 | Simple Mail Transfer Protocol (SMTP) E-mail Routing |
| 53 | Domain Name System (DNS) service |
| 80 | Hypertext Transfer Protocol (HTTP) used in World Wide Web |
| 110 | Post Office Protocol (POP3) used by e-mail clients to retrieve e-mail from a server |
| 119 | Network News Transfer Protocol (NNTP) |
| 123 | Network Time Protocol (NTP) |
| 143 | Internet Message Access Protocol (IMAP) Management of Digital Mail |
| 161 | Simple Network Management Protocol (SNMP) |
| 194 | Internet Relay Chat (IRC) |
| 443 | HTTP Secure (HTTPS) HTTP over TLS/SSL |

