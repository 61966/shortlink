package com.nageoffer.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 用户返还参数响应
 */
@Data
public class UserRespDTO {
    /**
     * 用户名
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

}
