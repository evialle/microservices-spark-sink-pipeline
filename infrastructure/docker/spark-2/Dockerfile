FROM openjdk:8u151-jdk
# SPARK
ARG SPARK_ARCHIVE=https://www.apache.org/dyn/closer.lua/spark/spark-2.2.1/spark-2.2.1-bin-hadoop2.7.tgz
RUN curl -s $SPARK_ARCHIVE | tar -xz -C /usr/local/

ENV SPARK_HOME /usr/local/spark-2.2.1-bin-hadoop2.7
ENV PATH $PATH:$SPARK_HOME/bin

# for High-availability like zoo-keeper's leader election
# COPY ha.conf $SPARK_HOME/conf

EXPOSE 4040 6066 7077 8080

WORKDIR $SPARK_HOME