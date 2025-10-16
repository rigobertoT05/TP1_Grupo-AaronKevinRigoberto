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
public class Bicibleta extends Vehiculo {
    private int cambios;
    private String tipoBicicleta;
    public Bicibleta(String marca, String placa,String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida, int cambios, String tipoBicicleta ) {
        super(marca, placa,"Bicicleta", horaEntrada, horaSalida);
        this.cambios = cambios;
        this.tipoBicicleta = tipoBicicleta;
    }

    @Override
    public double calcularTarifa() {
        long horas = calcularHorasParqueo();
        return horas * 300;
    }
     public String toString() {
    return "Bicicleta - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Cambios: " + cambios + ", Tipo: " + tipo;}

    @Override
    public String obtenerTipo() {
        return null;
    }
}