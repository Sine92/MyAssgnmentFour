package GoodInstitution;

public class OrderPrice implements CalculateOrderPrice {
 final private double price = 120.00;
    public OrderPrice()
    {

    }
    public String getBeefBurger()
    {
        return "Beef Buger";
    }
    public String getCheeseBurger()
    {
        return "Cheese Burger";
    }



    @Override
    public String calculatePrice(double price) {
        if(getBeefBurger()==getBeefBurger())
            return "Price Beef Burger : R"+(price + 10);
        else
        if(getCheeseBurger()==getCheeseBurger())
            return "Price Cheese Burger : R"+(price);
        else
            return "Made wrong selection please check order again";
    }
}
