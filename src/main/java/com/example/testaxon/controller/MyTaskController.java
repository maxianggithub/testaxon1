package com.example.testaxon.controller;


import com.example.testaxon.command.MyTaskCreateCommand;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.common.IdentifierFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTaskController {
    private final IdentifierFactory identifierFactory = IdentifierFactory.getInstance();

    @Autowired
    private CommandGateway commandGateway;

    @RequestMapping(value = "/test/anox/", method = RequestMethod.POST)
    public void createMyTask(@RequestParam String title, @RequestParam String describe) {
        System.out.println("step 1111");
        commandGateway.sendAndWait(new MyTaskCreateCommand(identifierFactory.generateIdentifier(), title, describe));
    }
}
