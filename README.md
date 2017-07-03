#Poc Big Data

This stack is a classic integration of data:
1. Events are received by Kafka
2. Kafka events are consumed by Spark
3. Data are stored by Spark in Cassandra

## Infrastructure

### Kafka

#### Kafka Manager Access
Accessing at Kafka Manager: http://localhost:9000

#### Scaling up
docker-compose scale kafka=n

replace n by the number of kafka number wished


### Spark

Accessing at Spark Manager: http://localhost:8080

#### Scaling up
docker-compose scale spark-worker=n

replace n by the number of spark number wished


### Cassandra

#### Accessing at Cassandra Console

Access at Zeppelin with http://localhost:8081

#### Scaling up
docker-compose scale cassandra-seed=n

replace n by the number of spark number wished

 
## Events Receiver

Receive events, thanks to it REST API.
Based on Spring Boot+Reactor

## Events Processor

Process the data, thank to the Spark Engine.
