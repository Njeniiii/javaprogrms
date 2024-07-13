import java.util.*;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jenifer
 */
public class breakex {
    public static void main(String args[]){
        
        for(int q=1;q<=10;q++){
            if(q==5){
                continue;
            }
            System.out.println(q);
            if(q==8){
                break;
            }
        }
    }
    
}
