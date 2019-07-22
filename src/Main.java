
import Behavioral.Decorator.CarroAgujereado;
import Behavioral.Decorator.CarroBonito;
import Behavioral.Decorator.CarroBrilloso;
import Behavioral.Decorator.CarroColorido;
import Behavioral.Decorator.CarroEnLlamas;
import Behavioral.Decorator.CarroFeo;
import Behavioral.Decorator.CarroGigante;
import Behavioral.Decorator.CarroJuguete;
import Behavioral.Decorator.CarroMediano;
import Behavioral.Decorator.CarroMonstruo;
import Behavioral.Decorator.Core.Carro;
import Behavioral.Decorator.Core.CarroInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main(String[] args) {
        CarroInterface[] consecionaria = {
            new CarroAgujereado(new Carro()),
            new CarroBonito(new Carro()),
            new CarroBrilloso(new Carro()),
            new CarroColorido(new Carro()),
            new CarroEnLlamas(new Carro()),
            new CarroFeo(new Carro()),
            new CarroGigante(new Carro()),
            new CarroJuguete(new Carro()),
            new CarroMediano(new Carro()),
            new CarroMonstruo(new CarroGigante(new CarroEnLlamas(new Carro())))
        };
        
        for(CarroInterface carro : consecionaria){
            carro.conducirlo();
        }
    }
}
