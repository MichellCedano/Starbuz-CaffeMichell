/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

/**
 *  Clase que crea una de las bebidas pero con la crema batida como condimento, agregando su precio
 * @author Michell Cedano Lopez 00000233230
 */
public class WhippedCream extends Condiment{
    /**
     * Se obtiene la bebida escogida
     * @param beverage la bebida escogida
     */
    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }
    /**
     * Metodo que obtiene la anterior descripción pero ahora le añadimos a la descripción que se trata
     * de crema batida
     * @return 
     */
    @Override
    public String getDescription() {
	return beverage.getDescription()+ ", crema batida";
    }
    /**
     * Metodo que obtiene el anterior costo de la bebida pero ahora le sumamos el costo del condimento
     * @return 
     */
    @Override
    public double getCost() {
        return beverage.getCost()+3.0;
    }
    
}
