//WAP to print big of two numbers using if else statement.

import java.util.*;

public class FlowControlQuestions {
  public static void main(String args[]){
    Scanner myobj = new Scanner(System.in);
    
    // int a = myobj.nextInt();
    // int b = myobj.nextInt();

    // if(a>b){
    //     System.out.print(a);
    // }
    // else{
    //     System.out.print(b);
    // }

    //2 WAP to print all are equal if all have same value or print biggest value of three numbers using if else statement.

    int a = myobj.nextInt();
    int b = myobj.nextInt();
    int c = myobj.nextInt();

    if(a==b && b==c){
        System.out.print("All are Equal");
    }
    else if(a>b &&a>c){
        System.out.print(a +" = Bigger Number is A");
    }
    else if(b>a && b>c){
        System.out.print(b +" =bigger Number is B");
    }

    else{
        System.out.print(c + " = bigger Number is C");
    }
    }
}




