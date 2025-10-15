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
public class Moto extends Vehiculo {
    private boolean tieneSidecar;
    private int cilindraje;
    public Moto(String marca, String placa, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        super(marca, placa, horaEntrada, horaSalida);
        this.tieneSidecar = tieneSidecar;
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularTarifa() {
        
        return 0;
        
    }
    
}
