package com.kumaran.paff.dao;

import com.kumaran.paff.model.cart;
import com.kumaran.paff.model.cartItem;

public interface cartItemDAO {


    public void addCartItem(cartItem cartItem);
    public void removeCartItem(cartItem cartItem);
    public void removeAllCartItems(cart cart);
    public cartItem getCartItemByProductId(int productId);

}
