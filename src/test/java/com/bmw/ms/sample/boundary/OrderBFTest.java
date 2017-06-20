/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmw.ms.sample.boundary;

import com.bmw.ms.business.base.ArquillianTestBase;
import javax.inject.Inject;
import org.junit.Assert;

/**
 *
 * @author UNGERW
 */
public class OrderBFTest extends ArquillianTestBase  {
    
    @Inject
    private OrderBF orderBF;
    
      // @Test
    //@UsingDataSet("datasets/bcl.json")
    public void testEndpoints() {
        Assert.assertNotNull(orderBF);
        //SalesOrder sa = orderBF.createSalesOrder();
        //Assert.assertNotNull(sa);
        
    }
    
}
