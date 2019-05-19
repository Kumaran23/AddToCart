package com.kumaran.paff.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class customerOrder implements Serializable {


    private static final long serialVersionUID = 5643527867177106284L;

    @Id
    @GeneratedValue
    private int customerOrderId;

    @OneToOne
    @JoinColumn(name = "cartId")
    private cart cart;

    @OneToOne
    @JoinColumn(name = "customerId")
    private customer customer;

   
    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public cart getCart() {
        return cart;
    }

    public void setCart(cart cart) {
        this.cart = cart;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

 
}
