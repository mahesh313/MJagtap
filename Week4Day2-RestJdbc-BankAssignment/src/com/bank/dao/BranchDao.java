package com.bank.dao;

import com.bank.model.Branch;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

@Repository
public class BranchDao {
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    @PostConstruct
    public void init() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?useSSL=false", "root", "root");
            System.out.println("Connected to DB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @PreDestroy
    public void close() {
        try{
            if(rs!=null){
                rs.close();
                rs = null;
            }
            if(stm!=null){
                stm.close();
                stm = null;
            }
            if(con!=null){
                con.close();
                con = null;
            }
            System.out.println("Disconnected from DB");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public Branch getBranch(String id) throws SQLException {
        stm = con.createStatement();
        System.out.println(id);
        rs = stm.executeQuery("SELECT * FROM bank.branch WHERE ifsc=" + id+";");
        Branch branch = new Branch();
        String ifsc = null;
        String name= null;
        String location= null;
        String type= null;
        String manager= null;
        int totalAccounts= 0;
        int totalEmployees=0;


        //Process the result
        while(rs.next()) {
            ifsc = rs.getString(1);

            name = rs.getString(2);
            System.out.println(name);
            location = rs.getString(3);
            type = rs.getString(4);
            manager = rs.getString(5);
            totalAccounts = rs.getInt(6);
            totalEmployees = rs.getInt(7);
        }


            branch.setIfsc(ifsc);
            branch.setLocation(location);
            branch.setName(name);
            branch.setType(type);
            branch.setManager(manager);
            branch.setTotalAccounts(totalAccounts);
            branch.setTotalEmployees(totalEmployees);

        return branch;
    }
}
