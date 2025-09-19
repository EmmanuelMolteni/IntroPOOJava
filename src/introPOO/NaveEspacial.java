/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introPOO;

/**
 *
 * @author manu7
 */
public class NaveEspacial {

  private int combustible = 50;
  private String nombre;
  private boolean despegar = false;

  public boolean getDespegar() {
    return despegar;
  }

  public void setDespegar(boolean despegar) {
    this.despegar = despegar;
  }

  public int getCombustible() {
    return combustible;
  }

  public void setCombustible(int combustible) {
    this.combustible = combustible;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void despegar() {
    despegar = true;
    System.out.println("La nave despego");
  }
  
  public void avanzar(int distancia) {
    if (despegar && combustible > 0 && combustible >= distancia) {
      combustible -= distancia;
      System.out.println("La nave avanzo: " + distancia + " Unidades, Combustible Restante:  " + combustible);
    } else if (despegar == false) {
      System.out.println("La nave aun no a despegado");
    } else if (combustible < distancia){
      System.out.println("No hay suficiente combustible para avanzar " + distancia + " Unidades de distancia");
    }
  }
  
  public void mostrarEstado() {
    System.out.println("Nombre: " + getNombre() + " Combustible Actual: " + getCombustible() + " Nave Desplegada: " + getDespegar());
  }
  
  public void recargarCombustible(int cant){
    combustible += cant;
    System.out.println("La nave recargo: " + cant + " de combustible");
  }
  
};
