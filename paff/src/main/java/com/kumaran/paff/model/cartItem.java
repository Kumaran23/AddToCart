package com.kumaran.paff.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class cartItem implements Serializable{




    private static final long serialVersionUID = 163888645447869209L;

    @Id
    @GeneratedValue
    private int cartItemId;

    @ManyToOne
    
    @JoinColumn(name = "cartId") 
    @JsonIgnore
   
    private cart cart;

 

    private int quantity; 
    private double totalPrice; 



    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public cart getCart() {
        return cart;
    }

    public void setCart(cart cart) {
        this.cart = cart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
