package com.cy.store.service;

import com.cy.store.entity.User;

public interface IUserService {
    /**
     * 用户注册方法
     * */
    void  reg(User user);

    User login(String username,String password);

    void changePassword(Integer uid,String username,String oldPassword,String newPassword);

    User getByUid(Integer uid);

    void changeInfo(Integer uid,String username,User user);

    void changeAvatar(Integer uid,
                      String avatar,
                      String username);
}
