package com.example.testaxon.event;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MyTaskCreateEvent {

    private String id;

    private String title;

    private String describe;
}
