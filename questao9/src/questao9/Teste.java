/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

/**
 *
 * @author Anonimus
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree raiz = new BinaryTree(10);
        System.out.println("Criando raiz com o valor 20");
        raiz.inserir(raiz,60);
        raiz.inserir(raiz,1);
        raiz.inserir(raiz,5);
        raiz.inserir(raiz,14);
        raiz.inserir(raiz,19);
        raiz.inserir(raiz,100);
        raiz.inserir(raiz,101);
        raiz.inserir(raiz,7);
        raiz.inserir(raiz,50);
        raiz.inserir(raiz,33);
        String total = Integer.toString(raiz.somaDasFolhas(raiz.left.right));
        String no = Integer.toString(raiz.left.right.valor);
        
        System.out.println("Soma do No: " + no + " \t Total das Folhas --> " + total );
        
        
        
        
    }
    
}
