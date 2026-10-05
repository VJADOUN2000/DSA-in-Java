import java.util.*;

public class Program1 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int num = sc.nextInt();

        // for(int i =1;i<=10;i++){
        //     System.out.println(num + " X " + i +" = " + num*i);
        // }

        int i=1;
        while(i<=10){
            System.out.println(num +" X " + i +" = " + num*i);
            i++;
        }
    }
}
