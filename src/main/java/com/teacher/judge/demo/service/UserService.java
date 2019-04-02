package com.teacher.judge.demo.service;

import com.teacher.judge.demo.bo.User;

public interface UserService {
    /** 查找用户*/
    User findById(String userId);

    /**更新用户信息*/
    boolean updateUserInfo(User user);

    /**通过账号、密码查找用户*/
    User findByUserNameAndAndPassword(String name, String pass);

    /**保存/更新用户*/
    User save(User user);

    /**通过账号查找用户*/
    User findByUserName(String userName);

}
