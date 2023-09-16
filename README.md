>Provision Kafka server on local by following document as -
>https://kafka.apache.org/quickstart
 
### To start kafka follow steps -
> Kafka -

1. start zookeeper -
   > `>D:\kafka_2.13-3.5.0\bin\windows\zookeeper-server-start.bat D:\kafka_2.13-3.5.0\config\zookeeper.properties`

2. Start Kafka server -
   > `>D:\kafka_2.13-3.5.0\bin\windows\kafka-server-start.bat D:\kafka_2.13-3.5.0\config\server.properties`

3. Create topic -
   > `>.\bin\windows\kafka-topics.bat --create --topic my-first-topic --bootstrap-server localhost:9092`
    
4. Describe Topic -
   > `>.\bin\windows\kafka-topics.bat --describe --topic my-first-topic --bootstrap-server localhost:9092`
 
5. Write some events into Topic -
   > `>.\bin\windows\kafka-console-producer.bat --topic my-first-topic --bootstrap-server localhost:9092`
 
6. Read Events from beginning-
   > `>.\bin\windows\kafka-console-consumer.bat --topic my-first-topic --from-beginning --bootstrap-server localhost:9092`
   > 
-----------------------------------------
#### Spring-Boot - Kafka configuration :- 
> [Ref - https://docs.spring.io/spring-kafka/reference/quick-tour.html]

1. Dependency need to add
