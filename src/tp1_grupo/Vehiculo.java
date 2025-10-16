/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_grupo;

import java.time.LocalDateTime;
import java.time.Duration;

/**
 *
 * @author rigoberto
 */
abstract class Vehiculo {
    protected String marca, placa, tipo;
    protected  LocalDateTime horaEntrada;
    protected LocalDateTime horaSalida;


    public Vehiculo(String marca, String placa, String tipo, LocalDateTime horaEntrada, LocalDateTime horaSalida) {
        this.marca = marca;
        this.placa = placa;
        this.horaEntrada = (horaEntrada != null) ? horaEntrada : LocalDateTime.now();
        this.horaSalida = horaSalida;
        this.tipo = tipo;
   
    }
    public long calcularHorasParqueo() {
        if (horaEntrada == null || horaSalida == null) {
            return 0;
        }
        long minutos = java.time.Duration.between(horaEntrada, horaSalida).toMinutes();
        return (minutos + 59) / 60;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    public abstract double calcularTarifa();
    
    
}
