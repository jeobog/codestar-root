package com.bg.cloud.controller;

import com.bg.cloud.domain.dto.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;

/**
 * Created by Admin on 28/12/2017.
 */
@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    private static final String MESSAGE_FORMAT = "Hello %s! Welcome to Bosun's AWS Cloud Service";

    @RequestMapping(method = RequestMethod.GET)
    public Response sayHello(@RequestParam(name = "myName", defaultValue = "Anonymous Geenie") String name) {
        return new Response(String.format(MESSAGE_FORMAT, name));
    }

    @RequestMapping(method = RequestMethod.POST)
    public Response helloWorldPost(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return new Response(String.format(MESSAGE_FORMAT, name));
    }
}
