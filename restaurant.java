import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class restaurant {
    public static void main (final String[] args) { 
        //Scanner inputs = new Scanner(Sysetm.in);
        System.out.println("Hi! Welcome to Alana's restaurant!");
        double californiaRolls = 10.00;
        double ramen = 15.00;
        double quesadilla = 5.00;
        double bentoBox = 15.00;
        double pasta = 15.00; 
        double milkTea = 4.50;
        double icedLatte = 4.00;
        double matchaTea = 4.00;
        System.out.println("The following items are: (1) California Rolls, (2) Ramen, (3) quesadilla, (4) bento box, (5) pasta, (6) milk tea, (7) iced latte, and (8) matcha tea! Type in the numbers that you want!");
        System.out.println("How many items would you like to order");
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt();
       /* ArrayList creates a a dynamic array, in ArrayList index is unknown .add is a built in function in library "ArrayList"
       For loop: used for user to input the specific amount of items they want in the specified array list length/size
        If statements: used to add price to total price and add strings to the array (to add on final receipt)
       */
        ArrayList<String> orderArray = new ArrayList<String>();
        System.out.println("Enter the number of the item(s) you would like to order");
        double subTotal = 0.0;
        for(int i=0; i<size; i++) {
            Scanner item = new Scanner(System.in);
            String foodItem = item.next();
            int food = Integer.parseInt(foodItem);
            if (food == 1){
                subTotal += californiaRolls;
                String str = "California Rolls";
                orderArray.add(str);
            }
            if (food == 2){
                subTotal += ramen;
                String str = "Ramen";
                orderArray.add(str);
            }
            if (food == 3){
                subTotal += quesadilla;
                String str = "Quesadilla";
                orderArray.add(str);
            }
            if (food == 4){
                subTotal += bentoBox;
                String str = "Bento Box";
                orderArray.add(str);
            }
            if (food == 5){
                subTotal += pasta;
                String str = "Pasta";
                orderArray.add(str);
            }
            if (food ==6){
                subTotal += milkTea;
                String str = "Milk Tea";
                orderArray.add(str);
            }
            if (food == 7){
                subTotal += icedLatte;
                String str = "Iced Latte";
                orderArray.add(str);
            }
            if (food == 8){
                subTotal += matchaTea;
                String str = "Matcha Latte";
                orderArray.add(str);
            }
            if (food < 1 || food > 8){
                System.out.println("Invalid order number. Please restart order and type in valid number(s).");
                System.exit(0);
            }
        }
        //double roundOff = (double) Math.round(a * 100) / 100;

        double totalPrice = subTotal;
        System.out.println("How much tip would you like to give? Input 10 for 10% and 15 for 15% ");
        Scanner tip = new Scanner(System.in);
        int waiter_tip= tip.nextInt();
        if (waiter_tip == 10){
            totalPrice = totalPrice * 1.10;
        }
        if (waiter_tip == 15){
            totalPrice = totalPrice *1.15;
        }
        subTotal = (double) Math.round(subTotal * 100) / 100;
        totalPrice = (double) Math.round(totalPrice * 100) / 100;
        System.out.println("Your order is: ");
        //
        for (int i = 0; i<orderArray.size(); i++){
            System.out.println(orderArray.get(i));
        }
        System.out.println("Your subtotal is $" + subTotal + " Your total price is $" + totalPrice);
        
    }
    

}



