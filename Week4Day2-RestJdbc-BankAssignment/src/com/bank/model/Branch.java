package com.bank.model;

public class Branch {

    private String ifsc;
    private String name;
    private String location;
    private String type;
    private String manager;
    private int totalAccounts;
    private int totalEmployees;

    public Branch() {}

    public Branch(String ifsc, String name, String location, String type, String manager, int totalAccounts, int totalEmployees) {
        this.ifsc = ifsc;
        this.name = name;
        this.location = location;
        this.type = type;
        this.manager = manager;
        this.totalAccounts = totalAccounts;
        this.totalEmployees = totalEmployees;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }

    public void setTotalAccounts(int totalAccounts) {
        this.totalAccounts = totalAccounts;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "ifsc='" + ifsc + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", manager='" + manager + '\'' +
                ", totalAccounts=" + totalAccounts +
                ", totalEmployees=" + totalEmployees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch Branch = (Branch) o;

        if (totalAccounts != Branch.totalAccounts) return false;
        if (totalEmployees != Branch.totalEmployees) return false;
        if (ifsc != null ? !ifsc.equals(Branch.ifsc) : Branch.ifsc != null) return false;
        if (name != null ? !name.equals(Branch.name) : Branch.name != null) return false;
        if (location != null ? !location.equals(Branch.location) : Branch.location != null) return false;
        if (type != null ? !type.equals(Branch.type) : Branch.type != null) return false;
        return manager != null ? manager.equals(Branch.manager) : Branch.manager == null;
    }

    @Override
    public int hashCode() {
        int result = ifsc != null ? ifsc.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (manager != null ? manager.hashCode() : 0);
        result = 31 * result + totalAccounts;
        result = 31 * result + totalEmployees;
        return result;
    }
}
