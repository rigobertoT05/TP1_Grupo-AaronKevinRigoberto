/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_AaronKevinRigoberto;

import java.time.LocalDateTime;

public class Camion extends Vehiculo {
    private final int ejes;
    public Camion(String marca, String placa,String tipo, LocalDateTime horaEntrada,LocalDateTime horaSalida, int ejes) {
        super(marca, placa,"Camion", horaEntrada, horaSalida);
        this.ejes = ejes;
    }

    @Override
    public double calcularTarifa() {
        long horas = calcularHorasParqueo();
        return horas * 2000;
    };
    
    @Override
     public String toString() {
    return "Camion - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Ejes: " + ejes;
}
     @Override
    public double obtenerTarifaHoraria() {
        return 2000.0;
    }

    @Override
    public String obtenerTipo() {
       return "Camion";
    }

}
