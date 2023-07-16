package com.test.petstore_api_testing_framework.helper;


public enum Status {

    available("available"),
    pending("pending"),
    sold("sold");

    private String value;

    Status(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
