
import java.io.*;
import java.util.*;
public class Swap{

void main(){

    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter A value:");
    a=sc.nextInt();
    System.out.println("enter B value:");
    b=sc.nextInt();
    System.out.println("before swap A,B value are: "+a+","+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swap A,B value are: "+a+","+b);
    

}

}