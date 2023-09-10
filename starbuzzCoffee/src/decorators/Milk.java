/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

/**
 *
 * @author Michell Cedano Lopez 00000233230
 */
public class Milk extends Condiment{ 
    
    public Milk(Beverage beverage) {
	this.beverage = beverage;
    }
    
    /**
     * Metodo que obtiene la anterior descripción pero ahora le añadimos a la descripción que se trata
     * de Leche
     * @return 
     */
    @Override
    public String getDescription() {
	return beverage.getDescription()+ ", Leche";
    }
    
    /**
     * Metodo que obtiene el anterior costo de la bebida pero ahora le sumamos el costo del condimento
     * @return 
     */
    @Override
    public double getCost() {
        return beverage.getCost()+2.0;
    }

    
}
