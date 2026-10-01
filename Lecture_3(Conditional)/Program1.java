import java.util.*;

public class Program1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        // int age = sc.nextInt();

        // if(age>18){
        //     System.out.print("You are an Adult");
        // }
        // else{
        //     System.out.print("You are not an Adult");
        // }

        // --------------To check odd and even Number----------------

        // int num = sc.nextInt();

        // if(num%2==0){
        //     System.out.println("Number is Even");
        // }
        // else{
        //     System.out.println("Number is Odd");
        // }


        // ===============To check or compare a and b ==============>

        // int a = sc.nextInt();
        // int b =sc.nextInt();

        // if(a==b){
        //     System.out.println("A is Equal to B");
        // }
        // else if(a>b){
        //     System.out.println("A is Greater than B");
        // }
        // else{
        //     System.out.println("B>A");
        // }


        // ==============Make a calculator with switch case===============>
        System.out.print("Enter number A: ");    
        int a =sc.nextInt();

        System.out.print("Enter number b: ");    
        int b =sc.nextInt();
        System.out.println("Select option from 1 to 5: ");
        System.out.println("1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Modulo");
        int option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a/b);
                break;
            case 4:
                System.out.println(a*b);
                break;
            case 5:
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Input");    
        }
    }
    
}
