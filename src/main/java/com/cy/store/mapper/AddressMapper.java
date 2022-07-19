package com.cy.store.mapper;
import com.cy.store.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AddressMapper {
    /**
     * 插入用户收货地址数据
     * @param adress
     * @return 受影响的行数
     */
    Integer insert(Address address);

    /**
     * 根据用户的id统计地址数量
     * @param uid
     * @return 当前收货地址的总数
     */
    Integer countByUid(Integer uid);

    /**
     *根据用户id查询用户的收货地址顺序
     * @param uid
     * @return 收货地址数据
     */
    List<Address> findByUid(Integer uid);

    /**
     * 查询收货地址数据
     * @param aid 收货地址Id
     * @return
     */
    Address findByAid(Integer aid);

    /**
     * 根据用户uid值修改用户的收货地址设置为非默认
     * @param uid 用户的id值
     * @return
     */
    Integer updateNonDefault(Integer uid);

    Integer updateDefaultByAid(
                        @Param("aid") Integer aid,
                        @Param("modifiedUser") String modifiedUser,
                        @Param("modifiedTime") Date modifiedTime
    );

    /**
     * 根据收货地址id删除收货地址数据
     * @param aid 收货地址的id
     * @return 受影响的行数
     */
    Integer deleteByAid(Integer aid);

    /**
     * 根据用户uid查询当前用户最后一次被修改的收货地址数据
     * @param uid 用户id
     * @return 收货地址
     */
    Address findLastModified(Integer uid);
}
