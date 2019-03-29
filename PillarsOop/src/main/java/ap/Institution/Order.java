package ap.Institution;

public class Order {
    private int orderId;
    private String cheeseBurger;
    private String beefBurger;
    private boolean available;
    public double price = 120.00;

    private Order()
    {

    }
    public Order(Builder kewuti)
    {
      this.orderId = kewuti.orderId;
      this.cheeseBurger = kewuti.cheeseBurger;
      this.beefBurger = kewuti.beefBurger;
      this.available = kewuti.available;


    }

    public int getOrderId() {
        return orderId;
    }

    public String getCheeseBurger() {
        return cheeseBurger;
    }

    public String getBeefBurger() {
        return beefBurger;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }

    public String calculatePrice(double price)
    {
        if(getBeefBurger()==getBeefBurger())
            return "Price Beef Burger : R"+(price + 10);
        else
            if(getCheeseBurger()==getCheeseBurger())
                return "Price Cheese Burger : R"+(price);
        else
            return "Made wrong selection please check order again";

    }


    public static class Builder {

        private int orderId;
        private String cheeseBurger;
        private String beefBurger;
        private boolean available;


        public Builder OrderId(int value)
        {
            this.orderId = value;
            return this;
        }
        public Builder CheeseBurger(String value)
        {
            this.cheeseBurger = value;
            return this;
        }
        public Builder BeefBurger(String value){
            this.beefBurger = value;
            return this;
        }
        public Builder Available(boolean value)
        {
            this.available = value;
            return this;
        }
        public Order build()
        {
            return new Order(this);
        }


    }


}
