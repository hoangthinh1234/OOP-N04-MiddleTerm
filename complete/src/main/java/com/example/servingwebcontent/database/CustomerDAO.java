package com.example.servingwebcontent.database;

import java.util.ArrayList;
import java.util.List;

import com.example.servingwebcontent.model.Customer;

public class CustomerDAO {

    public void insertCustomer(Customer customer){
     ///logic cua nhom voi customer
    }

    public   List<Customer> getAllCustomers(){
        
          Customer cus = new Customer("001", "test dua ra view", "test@gmailc.com", "09123455");
          Customer cus02 = new Customer("002", "test 02", "test@gmailc.com", "09123455");
          List<Customer> listCustomer = new ArrayList<Customer>();

          listCustomer.add(cus);
          listCustomer.add(cus02);

          ///service ket noi den CSDL

          return listCustomer;

       

      

    }
    
}
