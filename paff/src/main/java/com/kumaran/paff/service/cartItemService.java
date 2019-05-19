package com.kumaran.paff.service;

import com.kumaran.paff.model.cart;
import com.kumaran.paff.model.cartItem;

public interface cartItemService {


    void addCartItem(cartItem cartItem);
    void removeCartItem(cartItem cartItem);
    void removeAllCartItems(cart cart);
    cartItem getCartItemByProductId(int productId);
	public cart getCartById(cart cartId);
}
