/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao9;

import jdk.nashorn.internal.ir.BinaryNode;

/**
 *
 * @author Anonimus
 */
public class BinaryTree {
    
    int valor;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int valor) {
        this.valor = valor;
    }
    
    public void inserir(BinaryTree node, int valor){
        if(valor  < node.valor){
            if (node.left != null){
                inserir(node.left, valor);
            }
            else{
                node.left = new BinaryTree(valor);
            }
        }
        else if (valor > node.valor){
            if(node.right != null){
                inserir(node.right, valor);
            }
            else{
                node.right = new BinaryTree(valor);
            }
        }
    }
    
    public int somaDasFolhas(BinaryTree Node){
        int retorno;
        if(Node == null){
            retorno = 0;
        }
        else{
            retorno = 0;
            retorno += somaDasFolhas(Node.left);
            retorno += somaDasFolhas(Node.right);
            retorno += Node.valor;
        }
        return retorno;
    }
    
}
