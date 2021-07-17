package com.kang.utils;

import com.kang.shiro.AccountProfile;
import org.apache.shiro.SecurityUtils;

/**
 * @author kanseer
 * @create 2021-04-21 17:36
 */
public class ShiroUtil {
    public static AccountProfile getProfile(){
        return (AccountProfile) SecurityUtils.getSubject().getPrincipal();
    }
}
