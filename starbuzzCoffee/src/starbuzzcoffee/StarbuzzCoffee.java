/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

import decorators.*;

/**
 *  Clase que prueba creando diferentes bebidas con uno o mas condimentos
 *  calcuando de la misma manera su precio final
 * @author Michell Cedano Lopez 00000233230
 */
public class StarbuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    System.out.println("--------------------------------------------------------------");
    System.out.println("------------------------STARBUZZ-COFFE------------------------");
    System.out.println("--------------------------------------------------------------");
    System.out.println("--------------------- Pedido 1 - prueba ----------------------");
    Beverage beverage = new Expresso();
    System.out.printf(beverage.getDescription());
    System.out.println("                                             $" + beverage.getCost());
    System.out.println("--------------------------------------------------------------");
    System.out.println("--------------------- Pedido 2 - prueba ----------------------");
    Beverage beverage2 = new DarkRoast();
    beverage2 = new Chocolate(beverage2);
    beverage2 = new Milk(beverage2);
    beverage2 = new WhippedCream(beverage2);
    System.out.printf(beverage2.getDescription());
    System.out.println("    $" + beverage2.getCost());
    System.out.println("--------------------------------------------------------------");
    System.out.println("--------------------- Pedido 3 - prueba ----------------------");
    Beverage beverage3 = new HouseBlend();
    
    beverage3 = new Soy(beverage3);
    beverage3 = new Milk(beverage3);
    beverage3 = new Chocolate(beverage3);
    System.out.printf(beverage3.getDescription());
    System.out.println("           $" + beverage2.getCost());
    System.out.println("--------------------------------------------------------------");
    }
    
}
