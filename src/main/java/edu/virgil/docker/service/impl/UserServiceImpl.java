package edu.virgil.docker.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

import edu.virgil.docker.entity.User;
import edu.virgil.docker.mapper.UserMapper;
import edu.virgil.docker.service.UserService;

/**
 * @author virgil.Wang
 * @date 2019/8/2 11:29
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
