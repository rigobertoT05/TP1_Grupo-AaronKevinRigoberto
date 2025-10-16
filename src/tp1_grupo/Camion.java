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
    private int ejes;
    public Camion(String marca, String placa, LocalDateTime horaEntrada,LocalDateTime horaSalida, int ejes) {
        super(marca, placa, horaEntrada, horaSalida);
        this.ejes = ejes;
    }

    @Override
    public double calcularTarifa() {
        return 0;
    };
     public String toString() {
    return "Camion - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Ejes: " + ejes;
} }
