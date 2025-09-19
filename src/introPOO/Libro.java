/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introPOO;

/**
 *
 * @author manu7
 */
public class Libro {
  private String titulo;
  private String autor;
  private int anioPublicacion;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public int getAnioPublicacion() {
    return anioPublicacion;
  }

  public void setAnioPublicacion(int anioPublicacion) {
    if (anioPublicacion > 0){
      this.anioPublicacion = anioPublicacion;
    } else {
      System.out.println("Inserte un valor valido mayor a 0");
    }
  }
  
  
}
