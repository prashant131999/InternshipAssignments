package eccomerceoops;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Books[] b;
        Electronic[] e;
        Groceries[] g;
        Petshop[] p;

        b = new Books[2];
        e = new Electronic[2];
        g = new Groceries[2];
        p = new Petshop[2];
        //count the number of items
        int count = 0;
        int totalValueCart = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("List of products: \n" +
                    "1. Books\n" +
                    "2. Electronic\n" +
                    "3. Groceceries\n" +
                    "4. Petshop\n" +
                    "Enter the category of product you want:\n" +
                    "To end adding elements in cart type 'Finish'\n" +
                    "To view cart type 'Show'\n"
            );
            Scanner sc = new Scanner(System.in);
            String category = sc.nextLine();
            switch (category) {
                case "Electronic":
                    System.out.println("smart phones");
                    System.out.println("laptops");
                    System.out.println("Enter the Electronic item you want to add in cart");
                    Scanner sc1=new Scanner(System.in);

                    String electronicitem = sc1.nextLine();
                    switch (electronicitem) {
                        case "smart phones":
                            System.out.println("Enter the quantity:");
                            int quant = sc1.nextInt();
                            e[count++] = new Electronic("smart phones", 20000, "android",
                                    5, 1000.0F, 500,quant);
                            System.out.println("embedded  to cart");

                            break;
                        case "laptops":
                            System.out.println("Enter the quantity:");
                            quant = sc1.nextInt();
                            e[count++] = new Electronic("laptops", 30000, "portable",
                                    3, 2000.0F, 999,quant);
                            System.out.println("embedded  to cart");

                            break;

                    }
                    break;
                case "Books":
                    System.out.println("max payne");
                    System.out.println("sherlock holmes");
                    System.out.println("Enter the Books name you want to add in cart");
                    Scanner sc2=new Scanner(System.in);

                    String bookname = sc2.nextLine();
                    switch (bookname) {
                        case "max payne":
                            System.out.println("Enter the quantity:");
                            int quant = sc2.nextInt();
                            b[count++] = new Books("max payne", 300, "fiction",
                                    1, 20.0F, 10,quant);
                            System.out.println("embedded  to cart\n");

                            break;
                        case "sherlock holmes":
                            System.out.println("Enter the quantity:");
                            quant = sc2.nextInt();
                            b[count++] = new Books("sherlock holmes", 500, "sci-fi",
                                    1, 50.0F, 10,quant);
                            System.out.println("embedded  to cart\n");

                            break;

                    }
                    break;
                case "Grocceries":
                    System.out.println("Face wash");
                    System.out.println("Eggs");
                    System.out.println("Enter the Grocceries name you want to add in cart");
                    Scanner sc3=new Scanner(System.in);

                    String groceriesitem = sc3.nextLine();
                    switch (groceriesitem) {
                        case "Face wash":
                            System.out.println("Enter the quantity:");
                            int quant = sc3.nextInt();
                            g[count++] = new Groceries("Face wash", 175, "cleansing",
                                    (float) 0.1, 20.0F, 10,quant);
                            System.out.println("embedded  to cart\n");

                            break;
                        case "Eggs":
                            System.out.println("Enter the quantity:");
                            quant = sc3.nextInt();
                            g[count++] = new Groceries("Eggs", 5, "non veg",
                                    (float) 0.01, 1.0F, 1,quant);
                            System.out.println("embedded  to cart\n");

                            break;

                    }
                    break;
                case "Petshop":
                    System.out.println("cat");
                    System.out.println("dog");
                    System.out.println("Enter the Pet name you want to add in cart");
                    Scanner sc4=new Scanner(System.in);

                    String pets = sc4.nextLine();
                    switch (pets) {
                        case "cats":
                            System.out.println("Enter the quantity:");
                            int quant = sc4.nextInt();
                            p[count++] = new Petshop("cats", 4000, "brown",
                                    (float) 2, 200.0F, 10,quant);
                            System.out.println("embedded  to cart\n");

                            break;
                        case "dogs":
                            System.out.println("Enter the quantity:");
                            quant = sc4.nextInt();
                            p[count++] = new Petshop("dogs", 5000, "pitbull",
                                    10, 500, 100,quant);
                            System.out.println("embedded  to cart\n");

                            break;

                    }
                    break;
                case "Finish":
                    flag = false;
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
                                totalValueCart += b[j].GetTotalPrice();
                            }
                        }
                        for (int j = 0; j < count; j++) {
                            if (e[j] != null) {
                                e[j].promptsinfo();
                                System.out.println("Tax: " + e[j].GetTax());
                                System.out.println("Shipping Charge: " + e[j].GetShipping());
                                System.out.println("Quantity: " + e[j].GetQuantity());
                                totalValueCart += e[j].GetTotalPrice();
                            }
                        }
                        for (int j = 0; j < count; j++) {
                            if (g[j] != null) {
                                g[j].promptsinfo();
                                System.out.println("Tax: " + g[j].GetTax());
                                System.out.println("Shipping Charge: " + g[j].GetShipping());
                                System.out.println("Quantity: " + g[j].GetQuantity());
                                totalValueCart += g[j].GetTotalPrice();
                            }
                        }
                        for (int j = 0; j < count; j++) {
                            if (p[j] != null) {
                                p[j].promptsinfo();
                                System.out.println("Tax: " + p[j].GetTax());
                                System.out.println("Shipping Charge: " + p[j].GetShipping());
                                System.out.println("Quantity: " + p[j].GetQuantity());
                                totalValueCart += p[j].GetTotalPrice();
                            }
                        }

                    }
                    break;


            }
        }
        System.out.println("Your Final Purchase");
        if (count == 0) {
            System.out.println("Cart is empty");
        }
        System.out.println("TotalCartValue: " + totalValueCart);


    }
}
