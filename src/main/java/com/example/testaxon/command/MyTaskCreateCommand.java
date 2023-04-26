package com.example.testaxon.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

@Data
@AllArgsConstructor
public class MyTaskCreateCommand {
    @AggregateIdentifier
    private String id;

    private String title;

    private String describe;
}
