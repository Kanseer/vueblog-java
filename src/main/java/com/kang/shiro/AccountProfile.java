package com.kang.shiro;

import lombok.Data;

import java.io.Serializable;

/**
 * @author kanseer
 * @create 2021-04-05 18:27
 */
@Data
public class AccountProfile implements Serializable {
    private Long id;
    private String username;
    private String avatar;
    private String email;
}
