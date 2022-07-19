package com.cy.store.service;


import com.cy.store.entity.Address;
import com.cy.store.entity.User;
import com.cy.store.service.ex.ServiceException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressServiceImplTests {
    @Autowired
    private IAddressService addressService;
    @Test
    public void addNewAddress(){
        Address address=new Address();

        address.setPhone("13244657856");
        address.setName("lihua");
        addressService.addNewAddress(14,"管理员",address);
    }

    @Test
    public void setDefault(){
        addressService.setDefault(3,14,"管理员");
    }
}