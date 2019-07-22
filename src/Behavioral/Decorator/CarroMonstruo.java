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
public class CarroMonstruo extends CarroDecorado{
    
    public CarroMonstruo(CarroInterface interfaceCarroCore) {
        super(interfaceCarroCore);
    }

    @Override
    public void conducirlo(){
        super.conducirlo();
        this.conducirCarroAgujereado();
    }
    
    private void conducirCarroAgujereado(){
        System.out.println("Soy un 4x4 Muy Monstruoo!!");
    }
    
}
