import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenifer
 */
public class dowhileloop {
    public static void main(String args[]){
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=2;
        do{
            System.out.println(i);
            i=i+2;
        }while(i<=n);
        
    }
    
}
