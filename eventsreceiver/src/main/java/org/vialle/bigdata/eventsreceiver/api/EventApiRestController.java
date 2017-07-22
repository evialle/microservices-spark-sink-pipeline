package org.vialle.bigdata.eventsreceiver.api;

import oracle.jrockit.jfr.openmbean.EventSettingType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vialle.bigdata.beans.UniversalEvent;
import org.vialle.bigdata.eventsreceiver.technical.EventMessageProducer;

import java.util.concurrent.ExecutionException;

/**
 * Created by Eric on 08/07/2017.
 */
@RestController
public class EventApiRestController {

    @Autowired
    private EventMessageProducer eventMessageProducer;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public boolean testMessage(final UniversalEvent universalEvent) throws ExecutionException, InterruptedException {

            eventMessageProducer.sendMessage(universalEvent);
        return true;

    }
}
