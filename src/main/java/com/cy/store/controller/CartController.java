package com.cy.store.controller;


import com.cy.store.service.ICartService;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.CartVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("carts")
@RestController
public class CartController extends BaseController{
    @Autowired
    private ICartService cartService;

    @RequestMapping("add_to_cart")
    public JsonResult<Void> addToCart(Integer pid, Integer amount, HttpSession session){
        cartService.addToCart(getuidFromSession(session),pid,amount,getUsernameFromSession(session));
        return new JsonResult<>(OK);

    }

    @RequestMapping({"","/"})
    public JsonResult<List<CartVO>> getVOByUid(HttpSession session){
        List<CartVO> data = cartService.getVOByUid(getuidFromSession(session));
        return new JsonResult<>(OK,data);
    }

    @RequestMapping("{cid}/num/add")
    public JsonResult<Integer> addNum(Integer cid,HttpSession session){
        Integer data=cartService.addNum(cid,getuidFromSession(session),getUsernameFromSession(session));
        return new JsonResult<>(OK,data);
    }

    @RequestMapping("list")
    public JsonResult<List<CartVO>> getVOByCid(Integer[] cids,HttpSession session){
        List<CartVO> data = cartService.getVOByCid(getuidFromSession(session),cids);
        return new JsonResult<>(OK,data);
    }
}
