package com.kang.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author kanseer
 * @create 2021-04-05 14:00
 */
public class JwtToken implements AuthenticationToken {
    private String token;
    public JwtToken(String token) {
        this.token = token;
    }
    @Override
    public Object getPrincipal() {
        return token;
    }
    @Override
    public Object getCredentials() {
        return token;
    }
}