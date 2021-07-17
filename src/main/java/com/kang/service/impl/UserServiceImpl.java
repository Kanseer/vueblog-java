package com.kang.service.impl;

import com.kang.entity.User;
import com.kang.mapper.UserMapper;
import com.kang.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Kanseer
 * @since 2021-04-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
