package com.jalasoft.compiler.controller.responses;

public class Response {
    private String status;

    public Response(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
