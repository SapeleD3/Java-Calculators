package calculator;


import java.util.Scanner;
/**
 *
 * @author Gold D Moses
 */
public class Calculator {
    
    static int opt = 0;
    static Scanner scan = new Scanner(System.in);
    static double num1;
    static double num2;
    static double Ans;
    static String again;
    static boolean isAlive;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(isAlive = true){
       do{
      System.out.println("1 for Addition, 2 for Substracttion, 3 for Multiplication, and 4 for Division");
      opt = scan.nextInt();
       } while (opt < 1 && opt > 4);
       
       if(opt == 1){
           System.out.println("Enter your first Value: ");
           num1 = scan.nextDouble();
           
           System.out.println("Enter your Second value: ");
           num2 = scan.nextDouble();
           Ans = num1 + num2;
           System.out.println(Ans);
       }
       
       if(opt == 2){
            System.out.println("Enter your first Number: ");
           num1 = scan.nextDouble();
           
           System.out.println("Enter your Second Number: ");
           num2 = scan.nextDouble();
           Ans = num1 - num2;
           System.out.println(Ans);
           
       }
       
       if(opt == 3){
            System.out.println("Enter your first Number: ");
           num1 = scan.nextDouble();
           
           System.out.println("Enter your Second Number: ");
           num2 = scan.nextDouble();
           Ans = num1 * num2;
           System.out.println(Ans);
           
       }
       
       if(opt == 4){
            System.out.println("Enter your first Number: ");
           num1 = scan.nextDouble();
           
           System.out.println("Enter your Second Number: ");
           num2 = scan.nextDouble();
           Ans = num1 / num2;
           System.out.println(Ans);
           
       }
        }
    }
    
}
