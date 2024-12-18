import java.util.Scanner;
public class array {
    // array are used to store multiple values in a single variable instead of declaring separate variables for reach values
    // syntax = type var-name[];
    //          var-name=new type[size];
    //          int month_days[];
    //          month_days=new int[2];
    // types of array- one dimensional array,multi,jagged or rugged array***imp
     public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);

        //ask the user for the size of the arry
        System.out.print("Enter the size of the array");
        int size=scanner.nextInt();

        //create an array of the given size
        int[] array =new int[size];

        //take array i/p frm the user
        System.out.println("Enter" + size + "elements");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
         // display the elements of the array
         System.out.println("The elements  of the array are");
         for(int i=0;i<size;i++){
            System.out.print(array[i] + " ");
     }
    // close the scanner 
    scanner.close();
}
}
