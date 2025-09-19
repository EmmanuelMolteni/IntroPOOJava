/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introPOO;

/**
 *
 * @author manu7
 */
public class Mascotas {
  
  public String nombre, especie;
  private int edad = 0;
  
  public void mostrarInfo(){
    System.out.println(nombre + " " + especie + " " + "Edad: " +edad);
  };
  
  public void cumplirAnios(){
    edad += 1;
  };
}
