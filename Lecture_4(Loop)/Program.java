public class Program {
    public static void main(String args[]){
        // Starting of loop in Java

        //1. for loop 2. While Loop  3. Do while loop

        // simple for loop
        // for(int i=0;i<11;i++){

        //     System.out.print(i+" ");
        // }


        // ================While loop=================================>

        // lets do same code with while loop

        int j =0;
        while(j<11){
            System.out.print(j+" ");
            j++;
        }


        //==============Do-While loop====================


        int k =11;

        do{
            System.out.print(k); // it will run one time even if the condition is wrong
        } while(k<11);


        // Q print the sum of n number

        int n =10;
        int sum =0;
        for(int i= 0;i<=n;i++){
            sum =sum +i;

        }

        System.out.println(sum);

    }
}
