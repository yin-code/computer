package com.cy.store.mapper;


import com.cy.store.entity.Address;
import com.cy.store.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressMapperTests {
    @Autowired
    private AddressMapper addressMapper ;

   @Test
   public void countByUid(){
       Integer count=addressMapper.countByUid(14);
       System.out.println(count);
   }

   @Test
    public void findByUid(){
       List<Address> list =addressMapper.findByUid(14);
       System.out.println(list);
   }

   @Test
    public void findByAid(){
       System.err.println(addressMapper.findByAid(14));
   }

   @Test
    public void deleteByAid(){
       addressMapper.deleteByAid(2);
   }

   @Test
    public void findLastModified(){
       System.out.println(addressMapper.findLastModified(14));
   }
}
