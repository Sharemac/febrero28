/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Pizza P1 = new Pizza();
        P1.setSabor("pepperoni");
        P1.setPrecio(13.99);
        P1.setTamaño(12);
        System.out.println(P1.getSabor()+" "+ P1.getPrecio()+" "+P1.getTamaño());
       
    Scanner lectura = new Scanner(System.in);
    Pizza[] pizzas = new Pizza[10];
    for (int i = 0; i < 10; i++){
    pizzas[i] = new Pizza();
            System.out.println("Sabor: "+ i);
            pizzas[i].setSabor(lectura.next());
            System.out.println("Tamaño: "+ i);
            pizzas[i].setTamaño(lectura.nextInt());
            System.out.println("Precio: "+ i);
            pizzas[i].setPrecio(lectura.nextDouble());
    }
            
            
}
    
}
