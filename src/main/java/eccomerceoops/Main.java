package eccomerceoops;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Books []b;
        Electronic [] e;
        Grocceries [] g;
        Petshop [] p;

        b=new Books[2];
        e=new Electronic[2];
        g=new Grocceries[2];
        p=new Petshop[2];
        //count the number of items
         int count=0;
         int totalvaluecart=0;
         boolean flag=true;
         while(flag)
         {
             System.out.println("List of products: \n" +
                     "1. Books\n" +
                     "2. Electronic\n" +
                     "3. Groceceries\n" +
                     "4. Petshop\n" +
                     "Enter the category of product you want:\n" +
                     "To end adding elements in cart type 'Finish'\n" +
                     "To view cart type 'Show'\n"
             );
             Scanner sc= new Scanner(System.in);
             String category =sc.nextLine();
             switch (category)
             {
                 case "Electronic":
                     System.out.println("smart phones");
                     System.out.println("laptops");
                     System.out.println("Enter the Electronic item you want to add in cart");
                     String electronicitem=sc.nextLine();
                     switch (electronicitem)
                     {
                         case "smart phones":
                             System.out.println("Enter the quantity:");
                             int quant=sc.nextInt();
                             e[count++]=new Electronic("smart phones",20000,"android",
                                     5, 1000.0F,500);
                             System.out.println("embedded  to cart");

                             break;
                         case "laptops":
                             System.out.println("Enter the quantity:");
                              quant=sc.nextInt();
                             e[count++]=new Electronic("laptops",30000,"portable",
                                     3,2000.0F,999);
                             System.out.println("embedded  to cart");

                             break;

                     }
                     break;
                 case "Books":
                     System.out.println("max payne");
                     System.out.println("sherlock holmes");
                     System.out.println("Enter the Books name you want to add in cart");
                     String bookname= sc.nextLine();
                     switch (bookname)
                     {
                         case "max payne":
                             System.out.println("Enter the quantity:");
                             int quant=sc.nextInt();
                             b[count++] = new Books("max payne", 300, "fiction",
                                     1, 20.0F, 10);
                             System.out.println("embedded  to cart");

                             break;
                         case "sherlock holmes":
                             System.out.println("Enter the quantity:");
                              quant=sc.nextInt();
                             b[count++]=new Books("sherlock holmes",500,"sci-fi",
                                     1,50.0F,10);
                             System.out.println("embedded  to cart");

                             break;

                     }
                     break;
                 case "Grocceries":
                     System.out.println("Face wash");
                     System.out.println("Eggs");
                     System.out.println("Enter the Grocceries name you want to add in cart");
                     String grocceriesitem= sc.nextLine();
                     switch (grocceriesitem)
                     {
                         case "Face wash":
                             System.out.println("Enter the quantity:");
                             int quant=sc.nextInt();
                             g[count++] = new Grocceries("Face wash", 175, "cleansing",
                                     (float) 0.1, 20.0F, 10);
                             System.out.println("embedded  to cart");

                             break;
                         case "Eggs":
                             System.out.println("Enter the quantity:");
                              quant=sc.nextInt();
                             g[count++]=new Grocceries("Eggs",5,"non veg",
                                     (float) 0.01,1.0F,1);
                             System.out.println("embedded  to cart");

                             break;

                     }
                     break;
                 case "Petshop":
                     System.out.println("cat");
                     System.out.println("dog");
                     System.out.println("Enter the Pet name you want to add in cart");
                     String pets= sc.nextLine();
                     switch (pets)
                     {
                         case "cats":
                             System.out.println("Enter the quantity:");
                             int quant=sc.nextInt();
                             p[count++]=new Petshop("cats",4000,"brown",
                                     (float) 2,200.0F,10);
                             System.out.println("embedded  to cart");

                             break;
                         case "dogs":
                             System.out.println("Enter the quantity:");
                              quant=sc.nextInt();
                             p[count++]=new Petshop("dogs",5000,"pitbull",
                                     10,500,100);
                             System.out.println("embedded  to cart");

                             break;

                     }
                     break;
                 case "Finish":
                     flag=false;
                     break;
                 case "Show":
                     if (count == 0) System.out.println("Cart is empty");
                     else {
                         for (int j = 0; j < count; j++) {
                             if (b[j] != null) {
                                 b[j].promptsinfo();
                                 System.out.println("Tax: " + b[j].GetTax());
                                 System.out.println("Shipping Charge: " + b[j].GetShipping());
                                 System.out.println("Quantity: " + b[j].GetQuantity());
                                 totalvaluecart += b[j].GetTotalPrice();
                             }
                         }
                         for (int j = 0; j < count; j++) {
                             if (e[j] != null) {
                                 e[j].promptsinfo();
                                 System.out.println("Tax: " + e[j].GetTax());
                                 System.out.println("Shipping Charge: " + e[j].GetShipping());
                                 System.out.println("Quantity: " + e[j].GetQuantity());
                                 totalvaluecart += e[j].GetTotalPrice();
                             }
                         }
                         for (int j = 0; j < count; j++) {
                             if (g[j] != null) {
                                 g[j].promptsinfo();
                                 System.out.println("Tax: " + g[j].GetTax());
                                 System.out.println("Shipping Charge: " + g[j].GetShipping());
                                 System.out.println("Quantity: " + g[j].GetQuantity());
                                 totalvaluecart += g[j].GetTotalPrice();
                             }
                         }
                         for (int j = 0; j < count; j++) {
                             if (p[j] != null) {
                                 p[j].promptsinfo();
                                 System.out.println("Tax: " + p[j].GetTax());
                                 System.out.println("Shipping Charge: " + p[j].GetShipping());
                                 System.out.println("Quantity: " + p[j].GetQuantity());
                                 totalvaluecart += p[j].GetTotalPrice();
                             }
                         }

                     }
                     break;





             }
         }
        System.out.println("Your Final Purchase");
        if (count == 0)
        {
            System.out.println("Cart is empty");
        }
        System.out.println("TotalCartValue: " + totalvaluecart);






    }
}
