package com.cy.store.mapper;

import com.cy.store.entity.Product;

import java.util.List;

public interface ProductMapper {
    List<Product> findHotList();

    /**
     * 根据id查询商品信息
     * @param id
     * @return
     */
    Product findById(Integer id);
}
