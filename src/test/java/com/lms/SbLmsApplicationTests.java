/*package com.lms;


import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

import com.lms.bean.Laptop;
import com.lms.controller.LMSController;

@SpringBootTest
class SbLmsApplicationTests {

	@Autowired
    LMSController controller;
    String insert;
    String update;
    String delete;
    String result;
    String result1;
    
     List<Laptop> list = new ArrayList<Laptop>();
     List<Laptop> list1 = new ArrayList<Laptop>();
     Laptop laptop1;
     Laptop laptop2;
     Laptop laptop3;

     @Test
     @Order(1)
     void contextLoads() {

     }

     @Test
     @Order(2)
     public void testPerformInsert() {
         Laptop obj = new Laptop();
         obj.setLid(101);
         obj.setBrandName("Dell");
         obj.setModelName("Book");
         obj.setPrice(1);
         insert = "Inserted";
         result = controller.performInsert(obj);
         Assert.assertEquals(insert, result);
     }

     @Test
     @Order(3)
     public void testPerformUpdate() {
         Laptop obj = new Laptop();
         obj.setLid(101);
         obj.setBrandName("Dell");
         obj.setModelName("Book");
         obj.setPrice(1);
         update = "Updated";
         result = controller.performUpdate(obj);
         Assert.assertEquals(update, result);
     }

     @Test
     @Order(4)
     public void testPerformDelete() {
         delete = "Deleted";
         result = controller.performDelete(101);
         Assert.assertEquals(delete, result);
     }

     @Test
     @Order(5)
     public void testPerformFindAll() {
         list = controller.getAllLaptop();
         laptop1 = new Laptop(101 , "Dell" , "Book" , 1);
         laptop2 = new Laptop(102 , "HP" , "IdeaPad" , 4);
         laptop3 = new Laptop(103 , "Lenovo" , "Think" , 6);
         list1.add(laptop1);
         list1.add(laptop2);
         list1.add(laptop3);
         list.equals(list1);
     }


}
*/


