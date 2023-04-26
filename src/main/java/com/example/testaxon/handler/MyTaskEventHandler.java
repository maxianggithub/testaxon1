package com.example.testaxon.handler;


import com.example.testaxon.event.MyTaskCreateEvent;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.stereotype.Component;

@Component
public class MyTaskEventHandler {

    @EventHandler
    public void on(MyTaskCreateEvent event) {
        System.out.println("step 3333");
        System.out.println("aaaaa");
        System.out.println("do event" + event.getId());

    }
}
