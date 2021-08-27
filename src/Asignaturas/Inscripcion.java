
package Asignaturas;
import Miembros.Estudiante;

public class Inscripcion {
    
    private Curso paraEl;
    private Estudiante alumno;
    
    public Curso getCurso(){
        return this.paraEl;
    }
    
    public Inscripcion (Curso paraEl, Estudiante alumno){
        this.paraEl = paraEl;
        this.alumno = alumno;
        this.paraEl.agregarAlumno(this);
    }
    
    public Curso getparaEl(){
        return paraEl;
    }
    
    public void setparaEl(Curso pE){
        paraEl = pE;
    }
    
    public void setAlumno (Estudiante alum){
	alumno = alum;
    }
	
    public Estudiante getAlumno(){
	return alumno;
    }
    
    public static boolean verificarInscripcionAlumno( Estudiante e, Curso c){
	/*for(int i = 0; i <= c. ; i++) {
		if ( c.getdelAlumno()[i].equals(e))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		break;
	}*/
    String nombre = e.getnombre();
    String curso = c.gettitulo();
        for (int i=0; i < c.delAlumno.size(); i++){
            if(c.delAlumno.get(i).alumno.getnombre() == nombre && c.gettitulo() == curso){
                return true;  
            }
        }
        return false;
    }
    
    
    
}

