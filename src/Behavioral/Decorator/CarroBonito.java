/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Decorator;

import Behavioral.Decorator.Core.CarroDecorado;
import Behavioral.Decorator.Core.CarroInterface;

/**
 *
 * @author Estudiante
 */
public class CarroBonito extends CarroDecorado{
    
    public CarroBonito(CarroInterface interfaceCarroCore) {
        super(interfaceCarroCore);
    }
    
    @Override
    public void conducirlo(){
        super.conducirlo();
        this.conducirCarroBonito();
    }
    
    private void conducirCarroBonito(){
        System.out.println("Pero soy bellisimo");
    }
    
}
