package eccomerceoops;

public class Petshop extends Ecommerce{
    private float salestax;
    private float shippingcost;
    private float totalcost;
    private int   quantity;

    public Petshop(String name,int baseprice,String description,float weight,float salestax,float shippingcost )
    {
        super(name,baseprice,description,weight);
        this.salestax=salestax;
        this.shippingcost=shippingcost;
        this.totalcost=salestax+shippingcost+baseprice;
    }
    public void promptsinfo(){
        System.out.println("Name of product: "+get_name()+"\n"+
                "Base_Price: " + get_price()+"\n"+
                "Weight: "+get_weight()+"\n"+
                "Description: "+get_description());
    }
    public float GetTax(){
        return salestax;
    }
    public void SetTax(int t){
        salestax=t;
    }
    public float GetShipping(){
        return shippingcost*get_weight();

    }
    public void SetShipping(int s){
        shippingcost=s;
    }
    public int GetQuantity()
    {
        return quantity;
    }
    public float GetTotalPrice(){
        return (float) ((get_price() + (salestax/100.0)*(get_price()) + shippingcost*get_weight())*quantity);
    }

}
