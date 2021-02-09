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
    public Ecommerce(String name,int baseprice,String description,float weight)
    {
        this.name=name;
        this.baseprice=baseprice;
        this.description=description;
        this.weight=weight;

    }



    public  void prompts ()
    {
        System.out.println(name);
        System.out.println(baseprice);
        System.out.println(description);
    }
    public int totalprice( )
    {
        System.out.println(totalcost);
    }
    public void inventorylineitem()
    {
     System.out.println("inventory");
     System.out.println(baseprice);
     System.out.println(name);
     System.out.println(weight);
    }
    public void receipt()
    {
        System.out.println("Receipt");
        System.out.println(name);
        System.out.println(baseprice);
        System.out.println(salestax);
        System.out.println(shippingcost);
        System.out.println(totalcost);
    }


}
