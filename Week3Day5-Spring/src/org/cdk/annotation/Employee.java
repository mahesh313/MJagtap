package org.cdk.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {


    private int id;

    @Value("mahesh")
    private String name;
    private String phone;

    public Employee() {

    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Employee(String phone, int id) {
        this.id = id;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
