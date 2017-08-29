/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  UNGERW
 * Created: 02.06.2017
 */
Insert into T_SalesOrder (id, description, order_number, version) values (1, 'test order', '001',1);
Insert into T_SalesOrder (id, description, order_number,version) values (2, 'test order no 2', '002',1);
Insert into T_SalesOrder (id, description, order_number,version) values (3, 'test order no 3', '003',1);

Insert into T_SalesOrderDetail (id, description, detail_number, item, order_id,version) values (4, 'order detal', 1, 'Laptop', 1, 1);
Insert into T_SalesOrderDetail (id, description, detail_number, item, order_id,version) values (5, 'order detal', 2, 'Iphone', 1,1);
Insert into T_SalesOrderDetail (id, description, detail_number, item, order_id,version) values (6, 'order detal', 3, 'USB Stick', 1,1);
Insert into T_SalesOrderDetail (id, description, detail_number, item, order_id,version) values (7, 'order detal', 1, 'Laptop', 2,1);
Insert into T_SalesOrderDetail (id, description, detail_number, item, order_id,version) values (8, 'order detal', 2, 'Monitor', 2,1);

