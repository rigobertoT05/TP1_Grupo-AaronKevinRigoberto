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

    public Carro(String marca, String placa, String tipo ,LocalDateTime horaEntrada, LocalDateTime horaSalida, int numeroDePuertas) {
        super(marca, placa,"Carro", horaEntrada, horaSalida);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public double calcularTarifa() {
      long horas = calcularHorasParqueo();
        return horas * 1000;
      
    }
    public String toString() { 
    return "Carro - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Numero de Puertas: " + numeroDePuertas;
}


}  

