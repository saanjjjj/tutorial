 import java.util.Scanner;
 public class Prime {
    public static void main(String args[]){
        int i,a; 
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number"); // 4
        a=obj.nextInt(); // a becomes 4
        boolean flag=true;
        for(i=2;i<a;i++)// 2<4 true
        {
            if(a%i==0)//4%2==0 is true 
            flag=false; // flag is false
        }
        if(flag==true)//false==true returns 0 comes out of the loop
        {
            System.out.println(a+"is a prime number");
        }
        else{
            System.out.println(a+"is a not prime number");
        }
    }
}
