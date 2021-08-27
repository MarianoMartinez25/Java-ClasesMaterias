
package Miembros;


public class Persona {
    
    protected String nombre;
    
    public Persona (String nombre){
        this.nombre = nombre;
    }
    
    public void setnombre(String n){
        nombre = n;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    
    
}
