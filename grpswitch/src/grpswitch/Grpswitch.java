import java.util.*;



/**
 *
 * @author jenifer
 */
public class Grpswitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("enter the vowels");
        Scanner in=new Scanner(System.in);
        char ch=in.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':    
            case 'o':  
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("it is"+ch+"vowel");
                break;
            default:
                System.out.println("not vowel");
                break;
        
        
        
        
        }
        
                
                
    }
    
}
