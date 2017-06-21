/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmw.ms.business.sample.boundary;

import com.bmw.ms.business.base.ArquillianTestBase;
import com.bmw.ms.business.sample.entity.SalesOrder;
import java.math.BigInteger;
import java.util.List;
import javax.inject.Inject;
import org.jboss.arquillian.persistence.UsingDataSet;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author UNGERW
 */
public class OrderBFTest extends ArquillianTestBase {

    @Inject
    private OrderBF orderBF;

    private static final String ORDER_NO_1 = "order1";
    private static final String ORDER_NO_1b = "order1b";

    /**
     * simple test without existing testdata - testing all crud methods
     */
    @Test
    //@UsingDataSet("datasets/bcl.json")
    public void testSalesOrderCrud() {
        Assert.assertNotNull(orderBF);
        SalesOrder so = orderBF.createSalesOrder();
        Assert.assertNotNull(so);
        so.setOrderNumber(ORDER_NO_1);
        Assert.assertNotNull(so);
        //update/persist
        so = orderBF.persistSalesOrder(so);
        //find
        SalesOrder persSO = orderBF.findSalesOrder(ORDER_NO_1);
        Assert.assertNotNull(persSO);
        BigInteger id = persSO.getId();
        System.out.println(id);
        persSO = orderBF.findSalesOrder(id);
        Assert.assertNotNull(persSO);
        //update/merge
        persSO.setOrderNumber(ORDER_NO_1b);
        SalesOrder persSO1b = orderBF.mergeSalesOrder(persSO);
        Assert.assertNotNull(persSO1b);
        Assert.assertEquals(ORDER_NO_1b, persSO1b.getOrderNumber());

        //cleanup
        persSO1b = orderBF.findSalesOrder(ORDER_NO_1b);
        Assert.assertNotNull(persSO1b);
        orderBF.deleteSalesOrder(persSO1b.getId());
        persSO1b = orderBF.findSalesOrder(ORDER_NO_1b);
        Assert.assertNull(persSO1b);
    }

    /**
     * this test is using a dataset (json) file to import test data
     */
    @Test
    @UsingDataSet("datasets/salesorders.json")
    public void testSalesOrdersWithDataSet() {
        List<SalesOrder> salesOrders = orderBF.getAllSalesOrders();
        Assert.assertNotNull(salesOrders);
        Assert.assertEquals(2, salesOrders.size());
    }

}
