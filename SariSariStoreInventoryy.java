
package sarisaristoreinventoryy;

import java.util.Scanner;

public class SariSariStoreInventoryy {

    public static void main(String[] args) {

        
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Product Name: ");
        String question1 = sc.nextLine();
        
        System.out.print("Product Code: ");
        String question2 = sc.nextLine();
        
        System.out.print("Quantity In Stock: ");
        String question3 = sc.nextLine();
        
        System.out.print("Product Price: ");
        String question4 = sc.nextLine();
        
        System.out.print("Expiration Date: ");
        String question5 = sc.nextLine();
        
        System.out.print("Product Sold Today: ");
        String question6 = sc.nextLine();
        
        
        System.out.print("Store Location: ");
        String question7 = sc.nextLine();
        
        
        System.out.print("Supplier Name: ");
        String question8 = sc.nextLine();
        
        System.out.print("Discount Percentage" );
        String question9 = sc.nextLine();
        
        
        System.out.println("Product Name: " + question1);
        System.out.println("Product Code: " + question2);
        System.out.println("Quantity In Stock : " + question3);
        System.out.println("Product Price: " + question4);
        System.out.println("Discount Percentage: " + question5);
        System.out.println("Expiration Date: " + question6);
        System.out.println("Product Sold Today: " + question7);
        System.out.println("Store Location: " + question8);
        System.out.println("Supplier Name: " + question9);
        
    }
    
}
