package com.cy.store.mapper;

import com.cy.store.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/** 用户模块的持久层接口 */

public interface UserMapper {
    Integer insert(User user);

    User findByUsername(String username);

    /**
     * 根据用户的uid来修改用户密码
     */
    Integer updatePasswordByUid(Integer uid, String password, String modifiedUser, Date modifiedTime);

    /**
     * 根据用户id查询用户数据
     */
    User findByUid(Integer uid);

    /**
     * 更新用户的数据信息
     */
    Integer updateInfoByUid(User user);


    /**
     * @Param("SQL映射文件中#{}占位符的变量名")，解决的问题：当SQL语句的占位符和映射的接口方法参数名不一致时，需要将某个参数强行注入到某个占位符变量上时
     * 修改用户的头像
     * @param uid
     * @param avatar
     * @param modifiedUser
     * @param modifiedTime
     * @return
     */
    Integer updateAvatarByUid(@Param("uid") Integer uid,
                              @Param("avatar") String avatar,
                              @Param("modifiedUser") String modifiedUser,
                              @Param("modifiedTime") Date modifiedTime);
}
