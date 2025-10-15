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
public class Camion extends Vehiculo {
    private int tamaño,peso;
    public Camion(String marca, String placa, LocalDateTime horaEntrada,LocalDateTime horaSalida) {
        super(marca, placa, horaEntrada, horaSalida);
        this.tamaño = tamaño;
        this.peso = peso;
    }

    @Override
    public double calcularTarifa() {
        return 0;
    };
    
}
