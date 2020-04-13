import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
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
        System.out.println("Enter the number of the item you would like to order");
        double totalPrice = 0.0;
        for(int i=0; i<size; i++) {
            Scanner item = new Scanner(System.in);
            String foodItem = item.next();
            int food = Integer.parseInt(foodItem);
            if (food == 1){
                totalPrice += californiaRolls;
                String str = "California Rolls";
                orderArray.add(str);
            }
            if (food == 2){
                totalPrice += ramen;
                String str = "Ramen";
                orderArray.add(str);
            }
            if (food == 3){
                totalPrice += quesadilla;
                String str = "Quesadilla";
                orderArray.add(str);
            }
            if (food == 4){
                totalPrice += bentoBox;
                String str = "Bento Box";
                orderArray.add(str);
            }
            if (food == 5){
                totalPrice += pasta;
                String str = "Pasta";
                orderArray.add(str);
            }
            if (food ==6){
                totalPrice += milkTea;
                String str = "Milk Tea";
                orderArray.add(str);
            }
            if (food == 7){
                totalPrice += icedLatte;
                String str = "Iced Latte";
                orderArray.add(str);
            }
            if (food == 8){
                totalPrice += matchaTea;
                String str = "Matcha Latte";
                orderArray.add(str);
            }
        }
        System.out.println("Your order is: ");
        for (int i = 0; i<orderArray.size(); i++){
            System.out.println(orderArray.get(i));
        }
        System.out.println("Your price is $" + totalPrice);
        
    }
    

}



