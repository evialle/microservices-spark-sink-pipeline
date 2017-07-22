package org.vialle.bigdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.vialle.bigdata.beans.UniversalEvent;

/**
 * Created by Eric on 08/07/2017.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class EventMessageProducerTest {

    @Autowired
    private EventMessageProducer eventMessageProducer;

    @Test
    public void sendMessage() throws Exception {

        for (int i=0; i < 1000; i++) {
            UniversalEvent event = new UniversalEvent();
            event.setAuthor("myAuthor");
            event.setDevice("myDevice");
            event.setEvent("myEvent");
            eventMessageProducer.sendMessage(event);
        }

    }

}