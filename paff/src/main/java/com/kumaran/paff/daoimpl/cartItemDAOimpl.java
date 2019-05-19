package com.kumaran.paff.daoimpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kumaran.paff.dao.cartItemDAO;
import com.kumaran.paff.model.cart;
import com.kumaran.paff.model.cartItem;

import java.util.List;

@Repository
@Transactional
public class cartItemDAOimpl implements cartItemDAO{


    @Autowired
    private SessionFactory sessionFactory;

    public void addCartItem(cartItem cartItem) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        session.flush();

    }

    public void removeCartItem(cartItem cartItem) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(cartItem);
        session.flush();
    }

    public void removeAllCartItems(cart cart) {
        List<cartItem> cartItem = cart.getCartItems(); 

        
        for (cartItem item : cartItem) {
            removeCartItem(item);
        }

    }

    public cartItem getCartItemByProductId(int productId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from CartItem where productId = ?");
        query.setInteger(0, productId);
        session.flush();

        return (cartItem) query.uniqueResult();
        
    }
}
