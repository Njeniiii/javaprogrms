import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenifer
 */
public class fact {
    public static void main (String args[]){
        System.out.println("enter the no");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            
        }
        System.out.println("the fact is"+fact+"of"+n);
    }
    
}
