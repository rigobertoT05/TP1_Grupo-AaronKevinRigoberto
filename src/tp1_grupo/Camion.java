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
/**
 * Represents an abstract class for a truck (Camion) that extends the Vehiculo class.
 * This class encapsulates the common attributes and behaviors of trucks, including
 * specific functionalities related to calculating the fee and representing the truck as a string.
 * 
 * <p>
 * The Camion class has a private field for the number of axles (ejes) and requires 
 * specific parameters such as brand (marca), plate number (placa), entry time (horaEntrada), 
 * exit time (horaSalida), and the number of axles during instantiation.
 * </p>
 * 
 * <p>
 * This class provides an implementation for the calcularTarifa method, which is 
 * intended to calculate the fee for parking or using the truck, although the 
 * current implementation returns 0. It also overrides the toString method to provide 
 * a string representation of the truck's details.
 * </p>
 */
public abstract class Camion extends Vehiculo {
    private final int ejes;
    public Camion(String marca, String placa, LocalDateTime horaEntrada,LocalDateTime horaSalida, int ejes) {
        super(marca, placa, horaEntrada, horaSalida);
        this.ejes = ejes;
    }

    @Override
    public double calcularTarifa() {
        return 0;
    };
    
    @Override
     public String toString() {
    return "Camion - Marca: " + getMarca() +
           ", Placa: " + getPlaca() + ", Ejes: " + ejes;
} }
