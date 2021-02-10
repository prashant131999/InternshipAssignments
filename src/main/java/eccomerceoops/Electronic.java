package eccomerceoops;

public class Electronic extends Ecommerce {
    private float salestax;
    private float shippingcost;
    private float totalcost;
    private int quantity;

    /**
     * This is a constructor used  for initialize the parameter given by user
     *
     * @param name         for name of product
     * @param baseprice    for baseprice of product
     * @param description  for decription of product
     * @param weight       for weight of product
     * @param salestax     for salestax of product
     * @param shippingcost for shiping charges of product
     */

    public Electronic(String name, int baseprice, String description, float weight, float salestax, float shippingcost) {
        super(name, baseprice, description, weight);
        this.salestax = salestax;
        this.shippingcost = shippingcost;
        this.totalcost = salestax + shippingcost + baseprice;
    }

    /**
     * This method prints the information about product
     */
    public void promptsinfo() {
        System.out.println("Name of product: " + get_name() + "\n" +
                "Base_Price: " + get_price() + "\n" +
                "Weight: " + get_weight() + "\n" +
                "Description: " + get_description());
    }

    /**
     * This method return the total cost of price including the taxes
     *
     * @return total price
     */
    public float GetTotalPrice() {
        return (float) ((get_price() + (salestax / 100.0) * (get_price()) + shippingcost * get_weight()) * quantity);
    }

    /**
     * This method returns the sale tax
     *
     * @return salestax
     */
    public float GetTax() {
        return salestax;
    }

    public void SetTax(int t) {
        salestax = t;
    }

    public float GetShipping() {
        return shippingcost * get_weight();

    }

    /**
     * This method sets the shipping cost given by user
     *
     * @param s take shoping cost from user
     */
    public void SetShipping(int s) {
        shippingcost = s;
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