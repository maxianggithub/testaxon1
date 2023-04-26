package com.example.testaxon.domain;

import com.example.testaxon.command.MyTaskCreateCommand;
import com.example.testaxon.event.MyTaskCreateEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

@Aggregate
public class Mytask {

    @AggregateIdentifier
    private String id;

    public Mytask() {

    }

    @CommandHandler
    public Mytask(MyTaskCreateCommand command) {
        System.out.println("step 222");
        apply(new MyTaskCreateEvent(command.getId(), command.getTitle(), command.getDescribe()));
    }


    @EventSourcingHandler
    public  void on(MyTaskCreateEvent event) {
        this.id = event.getId();
    }

    private void apply(Object object){
        AggregateLifecycle.apply(object);
    }


}
