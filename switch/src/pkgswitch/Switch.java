import java.util.*;


/**
 *
 * @author jenifer
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       System.out.println("enter the operators");
       System.out.println("+");
       System.out.println("-");
       System.out.println("*");
       System.out.println("/");
       System.out.println("%");
       Scanner in=new Scanner(System.in);
       char ch=in.next().charAt(0);
       System.out.println("enter 2 numbers");
       int a=in.nextInt();
       int b=in.nextInt();
       int c;
       switch(ch){
           case '+':
               c=a+b;
               System.out.println("add"+c);
               break;
           case '-': 
                c=a-b;
               System.out.println("sub"+c);
               break;
            case '*': 
                c=a*b;
               System.out.println("mul"+c);
               break;  
            case '/': 
                c=a/b;
               System.out.println("div"+c);
               break;
            case '%': 
                c=a%b;
               System.out.println("mod"+c);
               break;
            default:
                System.out.println("enter crct input");
       }
       
       
       
      
       
       
       
    }
    
}
