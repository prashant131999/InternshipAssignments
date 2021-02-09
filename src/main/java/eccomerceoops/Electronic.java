package eccomerceoops;

public class Electronic extends Ecommerce{
    protected float salestax;
    protected float shippingcost;
    protected float totalcost;
    Electronic(String name,int baseprice,String description,float weight,float salestax,float shippingcost )
    {
        super(name,baseprice,description,weight);
        this.salestax=salestax;
        this.shippingcost=shippingcost;
        this.totalcost=salestax+shippingcost+baseprice;
    }



}
