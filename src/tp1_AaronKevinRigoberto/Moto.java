/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_AaronKevinRigoberto;

import java.time.LocalDateTime;

/**
 *
 * @author rigoberto
 */
public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    private int cilindraje;
    public Moto(String marca, String placa,String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida, int cilindraje,boolean tieneSidecar) {
        super(marca, placa,"Motocicleta", horaEntrada, horaSalida);
        this.tieneSidecar = tieneSidecar;
        this.cilindraje = cilindraje;
    }
    @Override
    public double calcularTarifa() {
      long horas = calcularHorasParqueo();
        return horas * 500;
        
    }
    
       public String toString() {
    return "Motocicleta - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Cilindraje: " + cilindraje + "Tiene Sidecar: " + tieneSidecar;
}
    @Override
    public String obtenerTipo() {
    return "Motocicleta";
}
    @Override
    public double obtenerTarifaHoraria() {
        return 500.0;
    }


       
    

    
}
