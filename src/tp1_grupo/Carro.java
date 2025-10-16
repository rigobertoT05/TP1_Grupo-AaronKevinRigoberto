/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo;

import java.time.LocalDateTime;

/**
 *
 * @author rigoberto
 */
public class Carro extends Vehiculo {
     public int numeroDePuertas; 

    public Carro(String marca, String placa, LocalDateTime horaEntrada, LocalDateTime horaSalida, int numeroDePuertas) {
        super(marca, placa, horaEntrada, horaSalida);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public double calcularTarifa() {
      
         return 0;
      
    }
    public String toString() { 
    return "Carro - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Numero de Puertas: " + numeroDePuertas;
}
}  

