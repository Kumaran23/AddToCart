package com.kumaran.paff.service;

import com.kumaran.paff.model.cart;

public interface cartService {


    cart getCartById(int cartId);
    void update(cart cart);
}
