package com.kumaran.paff.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kumaran.paff.dao.cartDAO;
import com.kumaran.paff.model.cart;
import com.kumaran.paff.service.cartService;

@Service
public class cartServiceImpl implements cartService{

    @Autowired
    private cartDAO cartDao;

    public void update(cart cart) {
        cartDao.update(cart);
    }



	public cart getCartById(int cartId) {
		return null;
	}
}
