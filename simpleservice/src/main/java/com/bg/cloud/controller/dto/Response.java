package com.bg.cloud.controller.dto;

/**
 * Basic POJO to contain a message.
 */
public class Response {

    private final String output;

    public Response(String output) {
        this.output = output;
    }

    public String getOutput() {
        return this.output;
    }
}
