/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bmw.ms.sample.entity;

import com.bmw.ms.base.entity.AbstractEntityTOI;

/**
 * transfer object interface - order without details (for example usage in lists)
 * @author UNGERW
 */
public interface SalesOrderTOI extends AbstractEntityTOI{

    String getDescription();

    String getOrderNumber();

    void setDescription(String description);

    void setOrderNumber(String orderNumber);
    
}
