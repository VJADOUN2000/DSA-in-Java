import java.util.*;

public class FirstCode{
    public static void main(String args[]){
        System.out.println("Revise Java for DSA"); // print is a function while System is a class
        System.out.print("Revise Java for DSA!\n"); // \n is used for next line
        System.out.print("Revise Java for DSA!\n"); // it will print in new line

        // print the pattern 

        System.out.print("*\n");
        System.out.print("* *\n");
        System.out.print("* * *\n");
        System.out.print("* * * *\n");


        // Variables in Java

        String name = "Tony Stark";
        int a =78;
        int b =63;
        double d = 893.56;
        char p = 'I';

        int sum =a+b;

        System.out.println(sum);

        //Scanner class

        Scanner sc = new Scanner(System.in);

        //String n1= sc.next(); // in this next only string will print till without spaces
        String n2 =sc.nextLine();
        System.out.println(n2);

    }
}

