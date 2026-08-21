# Database Optimization

**Database optimization** is the process of improving a database so that it can handle more requests efficiently with **lower response time and better resource usage**.

As the number of requests increases, we can generally optimize the database in the following order:

```text
Query Optimization
        ↓
Indexing
        ↓
Vertical Scaling
        ↓
Replication
        ↓
Partitioning
        ↓
Sharding
```

---

## 1. Query Optimization

Query optimization means **improving the database query** so that it performs less unnecessary work and returns results faster.

**Examples:** Avoid `SELECT *`, use proper `WHERE` conditions, reduce unnecessary joins, and use `EXPLAIN` to analyze queries.

```sql
-- Bad
SELECT * FROM users;

-- Better
SELECT id, name
FROM users
WHERE city = 'Chennai';
```

**Used when:** Queries are slow and need to be made more efficient.

---

## 2. Indexing

An **index** is a data structure that helps the database find records faster without scanning the entire table.

It is commonly used on columns involved in **WHERE, JOIN, ORDER BY, and search operations**.

```sql
CREATE INDEX idx_user_email
ON users(email);
```

### Without Index

```text
Search
  ↓
Scan many/all rows
  ↓
Find result
```

### With Index

```text
Search
  ↓
Index
  ↓
Find required row
```

**Used when:** The application performs frequent searches or reads on specific columns.

> **Note:** Indexes improve read performance but can slightly slow down `INSERT`, `UPDATE`, and `DELETE`.

---

## 3. Vertical Scaling

**Vertical Scaling (Scale Up)** means increasing the resources of the existing database server, such as **CPU, RAM, and storage**.

```text
Before
8 GB RAM + 4 CPU
       ↓
After
32 GB RAM + 16 CPU
```

**Used when:** The database server does not have enough CPU, RAM, or storage and you want a simple solution.

**Limitation:** A single server has a maximum hardware capacity.

---

## 4. Replication

**Replication** means creating copies of the database on multiple servers.

Usually, the **Primary** handles writes while **Read Replicas** handle read requests.

```text
              Application
             /           \
         WRITE            READ
           ↓                ↓
       Primary         Read Replica
                            ↓
                       Read Replica
```

**Used when:** The application is **read-heavy**, because read requests can be distributed across multiple replicas.

**Benefits:** Better read performance, scalability, and availability.

---

## 5. Partitioning

**Partitioning** divides a large table into smaller logical parts called **partitions**.

The partitions usually remain within the **same database system/server**.

### Example

A large `orders` table can be divided by year:

```text
Orders
 ├── 2024
 ├── 2025
 └── 2026
```

**Used when:** Tables become very large and queries usually access a specific range, such as **date, region, or category**.

### Types

* **Range Partitioning** → Based on ranges such as dates
* **List Partitioning** → Based on specific values such as regions
* **Hash Partitioning** → Based on a hash of a column

---

## 6. Sharding

**Sharding** divides database data across **multiple independent database servers**.

Unlike partitioning, shards are distributed across different machines.

```text
                Application
                     ↓
              Sharding Logic
             /      |       \
            ↓       ↓        ↓
        Shard 1  Shard 2  Shard 3
        Users A   Users B   Users C
```

**Used when:** The database has become too large or receives too many requests for a single server to handle.

**Benefits:** Massive scalability, distributed workload, and higher storage capacity.

---

# Quick Comparison

| Optimization           | What It Does               | Mainly Helps With    |
| ---------------------- | -------------------------- | -------------------- |
| **Query Optimization** | Makes queries efficient    | Slow queries         |
| **Indexing**           | Finds data faster          | Read performance     |
| **Vertical Scaling**   | Adds CPU/RAM to one server | Server capacity      |
| **Replication**        | Creates database copies    | Read-heavy workloads |
| **Partitioning**       | Splits large tables        | Large tables         |
| **Sharding**           | Splits data across servers | Massive scale        |

---

# Easy Way to Remember

```text
Slow Query
    ↓
Query Optimization
    ↓
Still slow?
    ↓
Indexing
    ↓
Server resources insufficient?
    ↓
Vertical Scaling
    ↓
Too many READ requests?
    ↓
Replication
    ↓
Tables becoming very large?
    ↓
Partitioning
    ↓
One server still not enough?
    ↓
Sharding
```

> **Important:** This is a general progression, not a strict rule. Real systems may use replication, partitioning, or sharding earlier depending on the workload and requirements.
