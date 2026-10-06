//package Lecture_5(Pattern1);
import java.util.*;

public class Pattern {
        public static void main(String args[]){

                //Q1 Print the Rectangle

                Scanner sc =new Scanner(System.in);

                System.out.print("Enter the Length of Rectangle: ");
                int a = sc.nextInt();

                System.out.print("Enter the Breadth of Rectangle: ");
                int b = sc.nextInt();

                // for(int i =1;i<=a;i++){
                //     for(int j =1;j<=b;j++){
                //         System.out.print("* ");
                //     }
                //     System.out.println();
                // }

                //Q2 Print the Hollow Rectanglr

                for(int i=1;i<=a;i++){
                    for(int j=1;j<=b;j++){
                        if(i==1 || j==1 || i==a || j==b){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                        
                    }
                    System.out.println();
                }
        }
}

