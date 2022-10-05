package com.ysr.departmentservice.controller;


import com.ysr.departmentservice.entity.Department;
import com.ysr.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/deparments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    Department saveDepartment(@RequestBody Department department){
log.info("Inside the method of saveDepartment() controller");
        return departmentService.saveDepartment(department);


    }




}
