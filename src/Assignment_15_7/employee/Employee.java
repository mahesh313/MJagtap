package Assignment_15_7.employee;

import Assignment_15_7.Month;
import Assignment_15_7.Year;

/**
 * Created by jagtapm on 7/16/2017.
 */
public class Employee {
    public String id;
    public String name;
    public Month joiningMonth;
    public Year joiningYear;
    public int attendance;
    public double accountBalance;
    public int grade;


    public Employee(String id, String name, Month joiningMonth, Year joiningYear, int attendance, double accountBalance, int grade) {
        this.id = id;
        this.name = name;
        this.joiningMonth = joiningMonth;
        this.joiningYear = joiningYear;
        this.attendance = attendance;
        this.accountBalance = accountBalance;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Month getJoiningMonth() {
        return joiningMonth;
    }

    public Year getJoiningYear() {
        return joiningYear;
    }

    public int getAttendance() {
        return attendance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getGrade() {
        return grade;
    }


}
