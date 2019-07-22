/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavioral.Decorator.Core;

/**
 *
 * @author Estudiante
 */
public class CarroDecorado implements CarroInterface{
    
    private CarroInterface core;
    
    public CarroDecorado(CarroInterface interfaceCarroCore){
        this.core = interfaceCarroCore;
    }
    
    @Override
    public void conducirlo() {
        this.core.conducirlo();
    }
    
}
