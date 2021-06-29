/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomer2;

/**
 *
 * @author rafii
 */
public class AntrianApp {
public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(9);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("Nama Saya Rafi Dimas Ramadani");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
}