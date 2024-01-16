package com.maya.service.impl;

import com.maya.entity.Permission;
import com.maya.dao.PermissionMapper;
import com.maya.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author anonymous
 * @since 2024-01-16
 */
@Service
@Transactional
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
