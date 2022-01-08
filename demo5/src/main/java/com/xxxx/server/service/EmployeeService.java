package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Employee;
import com.xxxx.server.pojo.RespPageBean;

import java.time.LocalDate;

/**
 * @Description
 * @Author qinyh
 * @date 2022/1/8
 */

public interface EmployeeService extends IService<Employee> {
    RespPageBean getEmployeeByPage(Integer currentPage, Integer size);

}

