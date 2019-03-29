package GoodInstitution;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderPriceTest {
    OrderPrice orderPrice;
    @Before
    public void setUp() throws Exception {
        orderPrice = new OrderPrice();
    }

    @Test
    public void getBeefBurger() {
        Assert.assertEquals(orderPrice.getBeefBurger(),orderPrice.getBeefBurger());
    }

    @Test
    public void getCheeseBurger() {
        Assert.assertEquals(orderPrice.getCheeseBurger(),orderPrice.getCheeseBurger());
    }

    @Test
    public void calculatePrice() {
        Assert.assertEquals(orderPrice.calculatePrice(120.00),orderPrice.calculatePrice(120.00));
    }
}