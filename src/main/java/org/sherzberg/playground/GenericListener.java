package org.sherzberg.playground;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.support.GenericMessage;

@EnableBinding(Sink.class)
public class GenericListener {

    @StreamListener(Sink.INPUT)
    public void loggerSink(GenericMessage message) {
        System.out.println("Received: " + message.toString());
    }

}
