package com.example.kodillahibernate.invoice.dao;
//
//import com.example.kodillahibernate.invoice.Invoice;
//import com.example.kodillahibernate.invoice.Item;
//import com.example.kodillahibernate.invoice.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class InvoiceDaoTestSuite {
//
//    @Autowired
//    private InvoiceDao invoiceDao;
//
//
//    @Test
//    void loadContext(){}
//
//
//    @Test
//    void testInvoiceDaoSave(){
//        //Given
//        Product product1 = new Product("Milk");
//        Product product2 = new Product("Beef");
//        Product product3 = new Product("Ice cream");
//
//        Item item1 = new Item(product1, new BigDecimal(5), 2);
//        Item item2 = new Item(product2, new BigDecimal(28), 10);
//        Item item3 = new Item(product3, new BigDecimal(8), 11);
//        Item item4 = new Item(product1, new BigDecimal(5), 43);
//
//        product1.setItem(item1);
//        product1.setItem(item4);
//        product2.setItem(item2);
//        product3.setItem(item4);
//
//        Invoice invoice = new Invoice("1234");
//        invoice.addItem(item1);
//        invoice.addItem(item2);
//        invoice.addItem(item3);
//        invoice.addItem(item4);
//
//        item1.setInvoice(invoice);
//        item2.setInvoice(invoice);
//        item3.setInvoice(invoice);
//        item4.setInvoice(invoice);
//
//        //When
//
//        invoiceDao.save(invoice);
//        int howManyItems = (int)invoiceDao.count();
//
//        //Then
//        assertEquals(4, howManyItems);
//
////        //Clean Up
////        invoiceDao.deleteAll();
//
//    }
//}
