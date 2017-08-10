package com.bank.model;

public class Customer {

    private String uid;
    private String name;
    private String address;
    private long contact;
    private short age;

    public Customer() {}

    public Customer(String uid, String name, String address, long contact, short age) {
        this.uid = uid;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.age = age;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact=" + contact +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (contact != customer.contact) return false;
        if (age != customer.age) return false;
        if (uid != null ? !uid.equals(customer.uid) : customer.uid != null) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return address != null ? address.equals(customer.address) : customer.address == null;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (int) (contact ^ (contact >>> 32));
        result = 31 * result + (int) age;
        return result;
    }
}
