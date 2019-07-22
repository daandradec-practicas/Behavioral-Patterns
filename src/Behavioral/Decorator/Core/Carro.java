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
public class Carro implements CarroInterface{
    @Override
    public void conducirlo(){
        System.out.print("Estoy siendo conducido, brum brumm: ");
    }
}
