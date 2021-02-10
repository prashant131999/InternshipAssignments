package eccomerceoops;

public class Electronic extends Product {
    private float salesTax;
    private float shippingCost;
    private float totalCost;
    private int quantity;

    /**
     * This is a constructor used  for initialize the parameter given by user
     *
     * @param name         for name of product
     * @param basePrice    for baseprice of product
     * @param description  for decription of product
     * @param weight       for weight of product
     * @param salesTax     for salestax of product
     * @param shippingCost for shiping charges of product
     */

    public Electronic(String name, int basePrice, String description, float weight, float salesTax
            , float shippingCost,int quantity) {
        super(name, basePrice, description, weight);
        this.salesTax = salesTax;
        this.shippingCost = shippingCost;
        this.quantity=quantity;
        this.totalCost = salesTax + shippingCost + basePrice;
    }

    /**
     * This method prints the information about product
     */
    public void promptsinfo() {
        System.out.println("Name of product: " + getName() + "\n" +
                "Base_Price: " + getPrice() + "\n" +
                "Weight: " + getWeight() + "\n" +
                "Description: " + getDescription());
    }

    /**
     * This method return the total cost of price including the taxes
     *
     * @return total price
     */
    public float GetTotalPrice() {
        return (float) ((getPrice() + (salesTax / 100.0) * (getPrice()) + shippingCost * getWeight()) * quantity);
    }

    /**
     * This method returns the sale tax
     *
     * @return salestax
     */
    public float GetTax() {
        return salesTax;
    }

    public void SetTax(int t) {
        salesTax = t;
    }

    public float GetShipping() {
        return shippingCost * getWeight();

    }

    /**
     * This method sets the shipping cost given by user
     *
     * @param s take shoping cost from user
     */
    public void SetShipping(int s) {
        shippingCost = s;
    }

    /**
     * This method returns the quantity
     *
     * @return the quantity
     */

    public int GetQuantity() {
        return quantity;
    }


}
