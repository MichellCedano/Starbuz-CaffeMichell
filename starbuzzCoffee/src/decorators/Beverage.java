/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

/**
 *  Clase que crea la bebida base que puede variar de descripción
 *  y precio
 * @author Michell Cedano Lopez 00000233230
 */
public abstract class Beverage {
    String description;

    /**
     * Metodo que devuelve la descripción de la bebida completa
     * @return 
     */
    public String getDescription() {
        return description;
    }
    /**
     * Metodo abstracto que obtendra el valor total de la bebida
     * @return 
     */
    public abstract double getCost();
    
}
