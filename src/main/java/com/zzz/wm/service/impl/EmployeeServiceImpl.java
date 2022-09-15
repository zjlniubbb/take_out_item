package com.zzz.wm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzz.wm.entity.Employee;
import com.zzz.wm.mapper.EmployeeMapper;
import com.zzz.wm.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author zjlniubbb
 * @version 1.0
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {

}
