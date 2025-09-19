/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introPOO;

/**
 *
 * @author manu7
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Estudiantes alumno1 = new Estudiantes();
    Mascotas mascota1 = new Mascotas();
    
    alumno1.nombre = "Juan";
    alumno1.apellido = "Pepino";
    
    alumno1.subirCalificacion(10);
    alumno1.bajarCalificacion(5);
    alumno1.mostrarInfo();
    
    System.out.println("*************************************");
    
    
    mascota1.nombre = "Broche";
    mascota1.especie = "Border Collie";
    mascota1.mostrarInfo();
    System.out.println("1 anio despues");
    mascota1.cumplirAnios();
    mascota1.mostrarInfo();
    System.out.println("1 anio despues");
    mascota1.cumplirAnios();
    mascota1.mostrarInfo();

    System.out.println("**********************************************");
    
    Libro lib1 = new Libro();
    
    lib1.setTitulo("El Arte de la seduccion");
    lib1.setAutor("Lucas Parietti");
    lib1.setAnioPublicacion(-1);
    lib1.setAnioPublicacion(2024);
    System.out.println(lib1.getTitulo() + " " + lib1.getAutor() + " " + lib1.getAnioPublicacion());
    
    System.out.println("**************************************************");
    
    Gallinas pajaro1 = new Gallinas();
    Gallinas pajaro2 = new Gallinas();
    
    pajaro1.setIdGallina(1);
    pajaro2.setIdGallina(2);
    
    
    pajaro1.envejecer();
    pajaro1.ponerHuevo();
    pajaro1.ponerHuevo();
    
    pajaro2.envejecer();
    pajaro2.envejecer();
    pajaro2.ponerHuevo();
    pajaro2.ponerHuevo();
    pajaro2.ponerHuevo();
    pajaro2.ponerHuevo();
    
    pajaro1.mostrarEstado();
    pajaro2.mostrarEstado();
    
    System.out.println("***********************************************");
    
    NaveEspacial nave1 = new NaveEspacial();
    nave1.setNombre("Nebula 1");
    
    nave1.mostrarEstado();
    nave1.despegar();
    nave1.mostrarEstado();
    nave1.avanzar(40);
    nave1.mostrarEstado();
    nave1.avanzar(20);
    nave1.mostrarEstado();
    nave1.avanzar(10);
    nave1.mostrarEstado();
    nave1.recargarCombustible(50);
    nave1.mostrarEstado();
    nave1.avanzar(10);
    nave1.mostrarEstado();
    
    
    
    
  }
  
}
