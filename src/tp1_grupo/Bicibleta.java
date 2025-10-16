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
    private String tipo;
    public Bicibleta(String marca, String placa, LocalDateTime horaEntrada, LocalDateTime horaSalida, int cambios, String tipo) {
        super(marca, placa, horaEntrada, horaSalida);
    }

    @Override
    public double calcularTarifa() {
        return 0;
    };
    
}
