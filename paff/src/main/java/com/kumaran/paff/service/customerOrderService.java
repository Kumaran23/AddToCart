package com.kumaran.paff.service;

import com.kumaran.paff.model.customerOrder;

public interface customerOrderService {


    public void addCustomerOrder(customerOrder customerOrder);
    public double getCustomerOrderGrandTotal(int cartId);
}
