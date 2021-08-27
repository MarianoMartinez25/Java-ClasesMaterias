
package Asignaturas;
import Miembros.Estudiante;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
public class Curso {
    
    private String titulo;
    ArrayList <Inscripcion> delAlumno = new ArrayList<>();
    Hashtable<Integer, String > contenedor;
    
    public Curso (String titulo){
        this.titulo = titulo;
        this.contenedor = new Hashtable<>();
    }
    
    public void agregarAlumno(Inscripcion i){
       delAlumno.add(i);    
    }
    
    public void AgregarHashtable (Estudiante est){
        Integer keys = est.getlegajo();
        String titulo = est.getnombre();
        contenedor.put(keys, titulo);
    }
 
    public void MostrarHastable (Integer p){
        System.out.println(""+contenedor.get(p));  
    }
 
    public void Mostrartodo(){
        Enumeration<String> enumeration = contenedor.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println( "valores" + enumeration.nextElement());
        }
    }
    
    public String gettitulo(){
        return titulo;
    }
    
    public void settitulo(String tit){
        titulo = tit;
    }
    
    /*public void setdelAlumno(Inscripcion[] delAlum){
	delAlumno = delAlum;
    }*/
	
    /*public Inscripcion[] getdelAlumno(){
	return delAlumno;
    }*/
    
    public void inscriptos(){
	int cantAlumnos = 0;
            System.out.println("Los alumnos inscriptos en este curso son: ");
            for (int x = 0; x < delAlumno.size(); x++){
                if(delAlumno == null){
                    break;
		}
		cantAlumnos +=1;
		System.out.println(delAlumno.get(x).getAlumno().getnombre());
            }
            System.out.println("La cantidad de inscriptos del curso es: " + cantAlumnos);
    }
    
    public void CantdeInscriptos(){
     switch(delAlumno.size()){
            case 0 : System.out.println("- En el curso "+ titulo + " no hay alumnos inscriptos");
                    break;
            case 1 : System.out.println("- En el curso "+ titulo + " hay " + delAlumno.size() + " alumno inscripto"); 
                    break;
            default: System.out.println("- En el curso "+ titulo + " hay " + delAlumno.size()
                + " alumnos inscriptos");  
            
        }  
    }
    
    /*public void setdelAlumno (Inscripcion insc){
        for (int i=0; i <= delAlumno.size(); i++)
            if (delAlumno[i] == null){
                delAlumno[i] = insc;
                break;
            }
    }*/
}
