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
public class CarroBrilloso extends CarroDecorado{
    
    public CarroBrilloso(CarroInterface interfaceCarroCore) {
        super(interfaceCarroCore);
    }
    
    @Override
    public void conducirlo(){
        super.conducirlo();
        this.conducirCarroBrilloso();
    }
    
    private void conducirCarroBrilloso(){
        System.out.println(" y brillo como una estrella ");
    }    
    
}
