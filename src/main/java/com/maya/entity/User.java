package com.maya.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author anonymous
 * @since 2024-01-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sys_user")
public class User implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 登录名称(用户名)
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 帐户是否过期(1-未过期,0-已过期)
     */
    private boolean isAccountNonExpired = true;

    /**
     * 帐户是否被锁定(1-未锁定,0-已锁定)
     */
    private boolean isAccountNonLocked = true;

    /**
     * 密码是否过期(1-未过期,0-已过期)
     */
    private boolean isCredentialsNonExpired = true;

    /**
     * 帐户是否可用(1-可用,0-不可用)
     */
    private boolean isEnabled = true;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 所属部门ID
     */
    private Long departmentId;

    /**
     * 所属部门名称
     */
    private String departmentName;

    /**
     * 性别(0-男,1-女)
     */
    private Boolean gender;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 是否是管理员(1-是,0-否)
     */
    private Boolean isAdmin;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除(0-未删除,1-已删除)
     */
    private Boolean isDelete;


    @TableField(exist = false)
    private Collection<? extends GrantedAuthority> authorities;

    @TableField(exist = false)
    private List<Permission> permissions;
}
