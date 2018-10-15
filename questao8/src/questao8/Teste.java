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
public class Teste {   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Principal princ;
        princ = new Principal();
        Scanner entrada = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();
        
        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();
        c = (Integer.valueOf(princ.montaC(a, b)) > 1000000) ? -1 : Integer.valueOf(princ.montaC(a, b));
        System.out.println("O valor de C é : " +Integer.toString(c));
        
    }
}
