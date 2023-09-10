/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

/**
 *  Clase que ayudara a crear mas condimentos sin necesidad de tenerlos enunciados
 *  en esta clase o no
 * @author Michell Cedano Lopez 00000233230
 */
public abstract class Condiment extends Beverage{
    public Beverage beverage;
    /**
     * Metodo que obtiene la descripción de la bebida base a la
     * que se le agregara o no un condimento
     * @return 
     */
    @Override
    public abstract String getDescription();
    
    
}
