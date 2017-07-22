# Poc Big Data

This stack is a classic integration of data:
1. An EventReceiver receive Events, with APIs exposed as as HTTP REST
1. Events are received by Kafka
2. Kafka events are consumed by Spark
3. Data are stored by Spark in Cassandra

## Infrastructure

Launch the infrastructure, thanks to docker compose:
```bash
cd infrastructure/docker
```

### Kafka

#### Kafka Manager Access
Accessing at Kafka Manager: http://localhost:9000
Declare Zookeeper in `Cluster`>`Add Cluster: input `zk:2181` in the field 'Cluster Zookeeper Hosts'.

#### Scaling up
docker-compose scale kafka=n

replace n by the number of kafka number wished
(beware to the volumes manangement)

### Bash Access
docker exec -ti <container name> /bin/bash


### Spark

Accessing at Spark Manager: http://localhost:8080

#### Scaling up
```bash
docker-compose scale spark-worker=n
```
replace n by the number of spark number wished
(beware to some issues due to common volumes)


### Cassandra

#### Accessing at Cassandra Console

Access at Zeppelin with http://localhost:8081

#### Scaling up
```bash
docker-compose scale cassandra-seed=n
```
replace n by the number of spark number wished
(beware to some issues due to common volumes)
 
## Events Receiver

Receive events, thanks to it REST API.
Based on Spring Boot+Reactor

## Events Processor

Process the data, thank to the Spark Engine.
