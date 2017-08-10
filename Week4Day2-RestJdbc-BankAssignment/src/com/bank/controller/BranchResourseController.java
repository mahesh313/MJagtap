package com.bank.controller;

import com.bank.dao.BranchDao;
import com.bank.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

import static org.springframework.util.MimeTypeUtils.APPLICATION_XML_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN;

@RestController
public class BranchResourseController {

    @Autowired
    BranchDao branchDao;

    @RequestMapping(value = "/branch/{id}",produces = "text/plain" ,method = RequestMethod.GET)
    public String readBranch(@PathVariable String id){
        Branch branch = null;
        try {
            branch = branchDao.getBranch(id);
            System.out.println("in controller");
            System.out.println(branch);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return branch.toString();
    }
}
