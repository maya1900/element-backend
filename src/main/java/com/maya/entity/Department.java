package com.maya.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 这是一个示例表，用于存储部门信息
 * </p>
 *
 * @author anonymous
 * @since 2024-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID字段，主键，自动递增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 部门字段
     */
    private String departmentName;

    /**
     * 电话字段
     */
    private String phone;

    /**
     * 地址字段
     */
    private String address;

    /**
     * 父ID字段
     */
    private Long pid;

    /**
     * 父级字段
     */
    private String parentName;

    /**
     * 排序字段
     */
    private Integer orderNum;

    /**
     * 是否删除字段
     */
    private Integer isDelete;


}
