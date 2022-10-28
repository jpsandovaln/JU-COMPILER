package com.jalasoft.compiler.controller.responses;

public class OKResponse extends Response {
    private String result;

    public OKResponse(String status, String result) {
        super(status);
        this.result = result;
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
