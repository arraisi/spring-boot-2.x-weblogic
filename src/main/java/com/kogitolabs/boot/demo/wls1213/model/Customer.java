package com.kogitolabs.boot.demo.wls1213.model;

public class Customer {
    private String id;
    private String name;
    private String since;

    public Customer() {
    }

    public Customer(String id, String name, String since) {
        this.id = id;
        this.name = name;
        this.since = since;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }
}
