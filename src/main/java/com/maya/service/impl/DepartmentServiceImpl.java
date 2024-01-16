package com.maya.service.impl;

import com.maya.entity.Department;
import com.maya.dao.DepartmentMapper;
import com.maya.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 这是一个示例表，用于存储部门信息 服务实现类
 * </p>
 *
 * @author anonymous
 * @since 2024-01-16
 */
@Service
@Transactional
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
