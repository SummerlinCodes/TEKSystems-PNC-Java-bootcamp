package com.evil.Accounting;

public class Accountant {
    private String name;
    private String jobTitle;

    public Accountant(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public void payBill(String name){
        this(name, "No Position");
    }

    public Accountant() {
        this(name, "No Position");
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
