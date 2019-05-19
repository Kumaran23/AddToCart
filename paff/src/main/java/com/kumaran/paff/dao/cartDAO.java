package com.kumaran.paff.dao;



import java.io.IOException;

import com.kumaran.paff.model.cart;


public interface cartDAO {


    public cart getCartById(int cartId);

    cart validate(int cartId) throws IOException;

    public void update(cart cart);

}

