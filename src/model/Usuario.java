package model;

/**
 *
 * @author santi
 */
public class Usuario {
    //Atributos
    private String nombre;
    private String contra;
    private boolean genero;
    
    //Constructor
    public Usuario(String nombre, String contra, boolean genero) {
        this.nombre = nombre;
        this.contra = contra;
        this.genero = genero;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
    
    
}
