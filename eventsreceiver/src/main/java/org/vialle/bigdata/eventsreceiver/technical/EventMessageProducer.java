package org.vialle.bigdata.eventsreceiver.technical;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;
import org.vialle.bigdata.beans.UniversalEvent;

import java.util.concurrent.ExecutionException;

/**
 * Created by Eric on 08/07/2017.
 */
@Component
public class EventMessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(final UniversalEvent event) throws ExecutionException, InterruptedException {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("myTopic", event.toString());
        SendResult<String, String> result = future.get();
        //result.getRecordMetadata();
    }
}
