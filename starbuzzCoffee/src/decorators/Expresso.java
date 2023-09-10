/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

/**
 *  Clase con tipo de bebida nueva
 * @author Michell Cedano Lopez 00000233230
 */
public class Expresso extends Beverage{
    /**
     * Metodo constructor que le da la descripción a la bebida
     */
    public Expresso() {
	description = "Expresso";
    }
    /**
     * metodo que asigna valor a la bebida
     * @return el valor que tendra la bebida
     */
    @Override
    public double getCost() {
        return 36.00;
    }
    
}
