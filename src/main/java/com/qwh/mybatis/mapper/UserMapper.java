package com.qwh.mybatis.mapper;

import com.qwh.mybatis.pojo.User;

import java.util.List;

/**
 * @auther qwh
 * @create 2023-04-2023/4/18 16:31
 */
public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();
    /**
     * 修改用户信息
     *
     * @return
     */
    boolean updateUser();
    /**
     * 查询用户信息
     *
     */
    User searchUser();

    /**
     * 查询所有的对象
     * @return
     */
    List<User> selectAllUser();

    /**
     *
     * 删除用户
     */
    boolean deleteUser();


}
