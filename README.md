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

1. Spring-Boot project creations -
   > Go to - https://start.spring.io/ & create project with latest options for Maven, Java, Packaging & add the dependencies for spring-web & spring-kafka
2. Add properties in application.properties -
   > spring.kafka.consumer.bootstrap-servers=localhost:9092
     spring.kafka.consumer.group-id=my-group
     spring.kafka.consumer.auto-offset-reset=earliest
     spring.kafka.consumer.key-deserializer=org.apache.kafka.common.serialization.StringDeserializer
     spring.kafka.consumer.value-deserializer=org.apache.kafka.common.serialization.StringDeserializer
     spring.kafka.producer.bootstrap-servers=localhost:9092
     spring.kafka.producer.key-serializer=org.apache.kafka.common.serialization.StringSerializer
     spring.kafka.producer.value-serializer=org.apache.kafka.common.serialization.StringSerializer
 
3. Create the Topic configuration class - KafkaTopicConfiguration
4. Create service class for producer - KafkaProducer
5. Create the rest controller end point to publish the message like - MessageController
6. To test this you need to keep kafka-console-consumer.bat running to poll the messages -
   
   Url - http://localhost:8080/api/publish?message=Test%20Message
7. Create a consumer by referring the class - KafkaConsumer </br>
   This will consume all the messages from the topic & groupId defines using the KafkaListerner.

### Configure kafka Producer/Consumer for JSON message

1. Need to update/add following properties in application.properties

   >spring.kafka.consumer.value-deserializer=org.springframework.kafka.support.serializer.JsonDeserializer
   spring.kafka.consumer.properties.spring.json.trusted.packages=*
   spring.kafka.producer.value-serializer=org.springframework.kafka.support.serializer.JsonSerializer
   > 

2. Create KafkaJsonProducer for the json payload
3. 
