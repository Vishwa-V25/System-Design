# Data and Database Types

## What is Data?

**Data** is a collection of raw facts, values, or information that can be stored and processed.

Data is mainly classified into **3 types**:

1. Structured Data
2. Semi-Structured Data
3. Unstructured Data

---

## 1. Structured Data

Structured data has a **fixed format or predefined schema**. It is usually stored in **rows and columns**.

### Example

| ID | Name   | Age | City      |
| -- | ------ | --- | --------- |
| 1  | Vishwa | 21  | Chennai   |
| 2  | John   | 22  | Bangalore |

### Databases Used

* MySQL
* PostgreSQL
* Oracle
* SQL Server

**Best suited for:** Banking systems, employee records, college management systems, etc.

---

## 2. Semi-Structured Data

Semi-structured data does not have a fixed table structure, but it contains **keys, tags, or other markers** to organize the data.

### Example

```json
{
  "name": "Vishwa",
  "age": 21,
  "skills": ["Java", "SQL"]
}
```

### Databases Used

* MongoDB
* Firebase Firestore
* CouchDB

**Best suited for:** Web applications, APIs, user profiles, and IoT data.

---

## 3. Unstructured Data

Unstructured data does not follow a **predefined schema or fixed format**.

### Examples

* Images
* Videos
* Audio
* PDFs
* Emails
* Text documents
* Social media posts

### Storage Used

* File Systems
* Object Storage
* Data Lakes
* Amazon S3
* Google Cloud Storage
* Azure Blob Storage

**Best suited for:** Large files, multimedia, documents, and raw data.

---

# Important Types of Databases

## 1. Relational Database (RDBMS)

A relational database stores data in **tables containing rows and columns**. Relationships between tables are created using keys such as **Primary Key and Foreign Key**.

**Examples:** MySQL, PostgreSQL, Oracle, SQL Server

**Used for:** Structured data.

---

## 2. Document Database

A document database stores data as **documents**, usually in JSON or JSON-like format. Different documents can have different structures.

**Example:** MongoDB

**Used for:** Semi-structured data and modern web applications.

---

## 3. Key-Value Database

A key-value database stores data as a simple **key → value** pair.

```text
user:101 → Vishwa
```

**Examples:** Redis, DynamoDB

**Used for:** Caching, sessions, and fast data access.

---

## 4. Graph Database

A graph database stores data as **nodes and relationships**.

```text
Vishwa ──FRIEND_OF──> John
```

**Example:** Neo4j

**Used for:** Social networks, recommendation systems, and relationship-based data.

---

## 5. Column-Family Database

A column-family database organizes data into **column families** and is designed to handle very large amounts of distributed data.

**Examples:** Cassandra, HBase

**Used for:** Big data and highly scalable applications.

---

# Quick Comparison

| Data Type           | Structure                    | Common Database / Storage    |
| ------------------- | ---------------------------- | ---------------------------- |
| **Structured**      | Fixed schema, rows & columns | MySQL, PostgreSQL, Oracle    |
| **Semi-Structured** | Flexible structure, JSON/XML | MongoDB, CouchDB             |
| **Unstructured**    | No predefined structure      | S3, Data Lakes, File Systems |

## Easy Way to Remember

```text
Structured      → SQL        → Tables
Semi-Structured → NoSQL      → JSON / Documents
Unstructured    → File/Data  → Images / Videos / PDFs
```
