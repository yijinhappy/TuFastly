package tufastly;

import org.hibernate.Session;
import tufastly.model.*;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.ArrayList;


public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        CenterAddress centerAddress = new CenterAddress();
        centerAddress.setCenterAddress1("LA");
        centerAddress.setCenterAddress2("SF");
        centerAddress.setCenterAddress3("CHI");
//        Customer customer = new Customer();
//        customer.setFirstName("stefan");
//        customer.setLastName("laioffer");
//
//        Order order1 = new Order();
//        order1.setEnableOrder(true);
//        order1.setPrice(1);
//
//        Order order2 = new Order();
//        order1.setEnableOrder(true);
//        order1.setPrice(2);

        //public void setOrders(List<Order> orders) {
        //        this.orders = orders;
        //    }

        //Order order = new Order();
        //order.setOrderList(new ArrayList<>());
        // order.getCartItem().add(cartItem1);
        // order.getCartItem().add(cartItem2);

        //customer.setCart(cart);

        session.save(centerAddress);

        session.getTransaction().commit();
        session.close();
    }
}

