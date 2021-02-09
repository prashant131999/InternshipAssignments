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



    public String get_name(){
        return name;
    }
    public int get_price(){
        return baseprice;
    }
    public float get_weight(){
        return weight;
    }
    public String get_description(){
        return description;
    }
    public void promptsinfo(){
        System.out.println("Name of product: "+name+"\n"+
                "Base_Price: "+baseprice+"\n"+
                "Weight: "+weight+"\n"+
                "Description: "+description) ;
    }

}
