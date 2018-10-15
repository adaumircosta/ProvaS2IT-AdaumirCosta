/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao8;

import java.util.Scanner;

/**
 *
 * @author Anonimus
 */
public class Principal {

    public Principal() {
    }
        
        public String montaC(int a, int b){
            String strA;
            String strB;
            String retorno;
            
            strA = Integer.toString(a);
            strB = Integer.toString(b);
            retorno = "";
               
            
            for (int i = 0; i < strA.length(); i++){
                retorno = retorno + Character.toString(strA.charAt(i));
                for(int j = i; j < strB.length(); j++){
                    retorno = retorno + Character.toString(strB.charAt(j));
                    if (i+1 < strA.length()){
                        break;
                    }
                }  
            }
            return retorno;
        }
    
}
