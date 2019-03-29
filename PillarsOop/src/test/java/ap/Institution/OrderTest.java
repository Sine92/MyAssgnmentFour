package ap.Institution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    Order order;
    @Before
    public void setUp() throws Exception {

        order = new Order
                .Builder()
                .BeefBurger("Beef Burger")
                .CheeseBurger("Cheese Burger")
                .Available(true)
                .OrderId(15)
                .build();
    }

    @Test
    public void getOrderId() {
        Assert.assertEquals(15,order.getOrderId());
    }

    @Test
    public void getCheeseBurger() {
        Assert.assertEquals("Cheese Burger",order.getCheeseBurger());
    }

    @Test
    public void getBeefBurger() {
        Assert.assertEquals("Beef Burger",order.getBeefBurger());
    }

    @Test
    public void isAvailable() {
        Assert.assertEquals(false,order.isAvailable());

    }

    @Test
    public void getPrice() {
        Assert.assertEquals(order.calculatePrice(120.00),order.calculatePrice(120.00));
    }

    @Test
    public void calculatePrice() {
        Assert.assertEquals(order.calculatePrice(120.00),order.calculatePrice(120.00));
    }
}