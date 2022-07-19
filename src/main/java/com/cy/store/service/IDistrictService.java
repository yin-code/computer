package com.cy.store.service;

import com.cy.store.entity.Address;
import com.cy.store.entity.District;

import java.util.List;

public interface IDistrictService {
    /**
     * 根据父代号查询区域信息
     * @param parent
     * @return
     */
    List<District> getByParent(String parent);

    String getNameByCode(String code);

    List<Address> getByUid(Integer uid);
}
