/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introPOO;

/**
 *
 * @author manu7
 */
public class Estudiantes {
  public String nombre;
  public String apellido;
  private String curso;
  private int clasificacion;
  
  public String getCurso(){
    return curso;
  }
  
  public void mostrarInfo(){
    System.out.println(nombre + " " + apellido + " - Clasificacion: " + clasificacion);
  }
  
  public void subirCalificacion(int puntos){
    clasificacion += puntos;
  }
  
  public void bajarCalificacion(int puntos){
    clasificacion -= puntos;
  }
  
}
