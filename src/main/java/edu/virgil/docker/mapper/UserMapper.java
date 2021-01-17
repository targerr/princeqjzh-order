package edu.virgil.docker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;

import edu.virgil.docker.entity.User;

/**
 * @author virgil.Wang
 * @date 2019/8/2 11:28
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
