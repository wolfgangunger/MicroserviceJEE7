/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmw.ms.sample.control;

import com.bmw.ms.base.control.AbstractDataService;
import com.bmw.ms.base.control.AbstractService;
import com.bmw.ms.sample.entity.SalesOrder;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

/**
 * there might be a lot of business logic for sales orders - therefore a addtional service class is required
 * the data service should not contain any business logic
 * @author UNGERW
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SalesOrderService extends AbstractService<SalesOrder> {


    @Inject
    private SalesOrderDataService orderDataService;

    @Override
    protected AbstractDataService<SalesOrder> getAbstractDataService() {
        return orderDataService;
    }

    public List<SalesOrder> getAllSalesOrders() {
        return orderDataService.getAllSalesOrders();
    }

    public SalesOrder findBySalesOrderByNumber(String orderNumber) {
        return orderDataService.findBySalesOrderByNumber(orderNumber);
    }

}
