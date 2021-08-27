
package Miembros;
import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import Asignaturas.ErrorInscripcion;

public class Estudiante extends Persona {
    
    private Integer legajo;
    private Inscripcion inscripto[];
    
    public Estudiante (String nombre, Integer legajo){
        super (nombre);
        this.legajo = legajo;
    }
    
    public Integer getlegajo(){
        return legajo;
    }
    
    public void setlegajo(Integer leg){
        legajo = leg;
    }
    
    public Inscripcion[] getinscripto(){
        return inscripto;
    }
    
    public void setinscripto (Inscripcion[] ins){
        inscripto = ins;
    }
    
    public void inscribir(Curso c){
	/*Inscripcion insc = new Inscripcion(c,this); 
	inscripto = insc;
	c.setdelAlumno(insc);*/
        for (int i=0; i<inscripto.length; i++){
              if(inscripto[i] == null){
                 inscripto[i]= new Inscripcion(c, this); 
                 break;
            }
        }
        
    }
    
    public void mostrarCurso(){
        //System.out.println("El alumno/a "+getnombre()+" esta inscripto en el curso "+inscripto.getcurso().gettitulo());
        System.out.println("Inscripcion exitosa del alumno "+nombre+" en el curso");
        for(Inscripcion inscripto1 : inscripto){
            System.out.println("*-*" + inscripto1.getparaEl().gettitulo());
        }
    }
    
    public void cantInscriptos (int e) throws ErrorInscripcion{
        if (e>3){
            throw new ErrorInscripcion("Error al inscribir al alumno "+nombre+" , cantidad maxima de materias inscriptas");
        } 
        else{
            inscripto = new Inscripcion[e];
        }
    }
    
}
