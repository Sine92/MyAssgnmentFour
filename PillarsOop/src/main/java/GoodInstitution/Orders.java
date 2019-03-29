package GoodInstitution;



public class Orders {

    private int orderId;
    private String cheeseBurger;
    private String beefBurger;
    private boolean available;
    public double price = 120.00;

    public Orders()
    {

    }
    public Orders(Builder kewuti)
    {
        this.orderId = kewuti.orderId;
        this.cheeseBurger = kewuti.cheeseBurger;
        this.beefBurger = kewuti.beefBurger;
        this.available = kewuti.available;
        this.price = kewuti.price;


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




    public static class Builder {

        private int orderId;
        private String cheeseBurger;
        private String beefBurger;
        private boolean available;
        private double price;


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
        public Builder price(double value)
        {
          this.price = value;
          return this;
        }
        public Orders build()
        {
            return new Orders(this);
        }


    }


}


