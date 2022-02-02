import java.util.*;  
class ReverNUM {  
    public static void main(String[] args) {  
       int x, y, t;
       
       //inputs
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the value of the 1st digit and the second digit");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       
       //Outputs
       System.out.println("before swapping numbers: "+x +" "+ y);  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+ x + " " + y);  
       System.out.println( );  
    }    
}  