package eccomerceoops;

public class Ecommerce {
    protected String name;
    protected int baseprice;
    protected String description;
    // weight is in kg
    protected float weight;
    protected float salestax;
    protected float shippingcost;
    protected float totalcost;

    /**
     * This constructor initialize name,baseprice,description and weight given by user
     *
     * @param name        for product name
     * @param baseprice   for baseprice of product
     * @param description for description of product
     * @param weight      for weight of product
     */
    public Ecommerce(String name, int baseprice, String description, float weight) {
        this.name = name;
        this.baseprice = baseprice;
        this.description = description;
        this.weight = weight;

    }

    /**
     * This method return the name of product
     *
     * @return name of product
     */

    public String get_name() {
        return name;
    }

    /**
     * This method return the base price of product given by user
     *
     * @return base price
     */
    public int get_price() {
        return baseprice;
    }

    /**
     * This method return the weight given by user
     *
     * @return weight
     */
    public float get_weight() {
        return weight;
    }

    /**
     * This method return the description of product given by user
     *
     * @return description
     */
    public String get_description() {
        return description;
    }

    /**
     * This method prints the information about product
     */
    public void promptsinfo() {
        System.out.println("Name of product: " + name + "\n" +
                "Base_Price: " + baseprice + "\n" +
                "Weight: " + weight + "\n" +
                "Description: " + description);
    }

}
