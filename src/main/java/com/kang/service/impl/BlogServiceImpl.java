package com.kang.service.impl;

import com.kang.entity.Blog;
import com.kang.mapper.BlogMapper;
import com.kang.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
