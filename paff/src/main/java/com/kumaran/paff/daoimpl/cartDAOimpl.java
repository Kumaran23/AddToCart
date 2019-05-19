package com.kumaran.paff.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kumaran.paff.dao.cartDAO;
import com.kumaran.paff.model.cart;

import java.io.IOException;


@Repository
@Transactional
public class cartDAOimpl implements cartDAO {


    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private com.kumaran.paff.service.customerOrderService customerOrderService;

    public cart getCartById(int cartId) {
        Session session = sessionFactory.getCurrentSession();

        return (cart) session.get(cart.class, cartId);
    }

    public cart validate(int cartId) throws IOException {
        cart cart = getCartById(cartId);
      
        if (cart == null || cart.getCartItems().size() == 0) {
            throw new IOException(cartId+"");
        }
        update(cart);
        return cart;
    }

    public void update(cart cart) {
        int cartId = cart.getCartId();
        double grandTotal = customerOrderService.getCustomerOrderGrandTotal(cartId);
        cart.setGrandTotal(grandTotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);

    }
}
