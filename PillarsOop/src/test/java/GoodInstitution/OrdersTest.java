package GoodInstitution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrdersTest {
    private Orders orders;
    @Before
    public void setUp() throws Exception {
        orders = new Orders.Builder()
                .OrderId(36)
                .CheeseBurger("Cheese Burger")
                .BeefBurger("Beef Burger")
                .Available(true)
                .price(120.00)
                .build();
    }

    @Test
    public void getOrderId() {
        Assert.assertEquals(36,orders.getOrderId());

    }

    @Test
    public void getCheeseBurger() {
        Assert.assertEquals("Cheese Burger",orders.getCheeseBurger());

    }

    @Test
    public void getBeefBurger() {
        Assert.assertEquals("Beef Burger",orders.getBeefBurger());
    }

    @Test
    public void isAvailable() {
        Assert.assertEquals(true,orders.isAvailable());

    }




}