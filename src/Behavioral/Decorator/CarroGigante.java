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
public class CarroGigante extends CarroDecorado{
    
    public CarroGigante(CarroInterface interfaceCarroCore) {
        super(interfaceCarroCore);
    }
    
    @Override
    public void conducirlo(){
        super.conducirlo();
        this.conducirCarroGigante();
    }
    
    private void conducirCarroGigante(){
        System.out.println("Pero desde aqui todos se ven muy chiquitos");
    }
    
}
