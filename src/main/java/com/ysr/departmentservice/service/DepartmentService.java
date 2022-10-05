package com.ysr.departmentservice.service;

import com.ysr.departmentservice.entity.Department;
import com.ysr.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
log.info("Inside the DepartmentService class method of saveDepartment()");
       return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId){

        log.info("Inside the DepartmentService class method of findDepartmentById()");

        return departmentRepository.findByDepartmentId(departmentId);
    }
}
