package com.laioffer.onlineOrder;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laioffer.onlineOrder.entity.Customer;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // read operation
        response.setContentType("application/json");
        ObjectMapper mapper = new ObjectMapper();
        Customer customer= new Customer();
        customer.setEmail("sun@laioffer.com");
        customer.setPassword("123456");
        customer.setFirstName("rick");
        customer.setLastName("sun");
        customer.setEnabled(true);

        response.getWriter().print(mapper.writeValueAsString(customer));

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response){
        // write operation
    }

    public void destroy() {
    }
}