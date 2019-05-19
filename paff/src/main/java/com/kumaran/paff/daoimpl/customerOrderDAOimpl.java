package com.kumaran.paff.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kumaran.paff.model.customerOrder;


@Repository
@Transactional
public class customerOrderDAOimpl implements customerOrderDAO {


    @Autowired
    private SessionFactory sessionFactory;

    public void addCustomerOrder(customerOrder customerOrder) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customerOrder);
        session.flush();
    }
}
