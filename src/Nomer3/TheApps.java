/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer3;

/**
 *
 * @author rafii
 */
public class TheApps {
 public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        //Rafi Dimas Ramadani
        Node siNode;
        
        siNode = new Node(50);
        tree.insert(siNode);
        
        siNode = new Node(30);
        tree.insert(siNode);
        
        siNode = new Node(20);
        tree.insert(siNode);
        
        siNode = new Node(40);
        tree.insert(siNode);
        
        siNode = new Node(70);
        tree.insert(siNode);
        
        System.out.print("\nTraversal dengan inOrder: ");
        tree.inOrder();
        System.out.print("\nTraversal dengan preOrder: ");
        tree.preOrder();
        System.out.print("\nTraversal dengan postOrder: ");
        tree.postOrder();        
    }
}
