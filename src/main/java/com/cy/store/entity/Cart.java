package com.cy.store.entity;

import java.io.Serializable;
import java.util.Objects;

public class Cart extends BaseEntity {
    private Integer cid;
    private Integer uid;
    private Long price;
    private Integer num;
    private Integer pid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(cid, cart.cid) &&
                Objects.equals(uid, cart.uid) &&
                Objects.equals(price, cart.price) &&
                Objects.equals(num, cart.num) &&
                Objects.equals(pid, cart.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cid, uid, price, num, pid);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cid=" + cid +
                ", uid=" + uid +
                ", price=" + price +
                ", num=" + num +
                ", pid=" + pid +
                '}';
    }
}
