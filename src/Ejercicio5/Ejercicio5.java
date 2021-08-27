
package Ejercicio5;
import Miembros.Estudiante;
import Miembros.Profesor;
import Asignaturas.Curso;
import Asignaturas.Inscripcion;
import Asignaturas.ErrorInscripcion;

public class Ejercicio5 {
    
    public static void main (String [] args){
        
        
        Curso c1 = new Curso("Paradigmas");
        Curso c2 = new Curso("Sintaxis");
        Curso c3 = new Curso ("Operativos");
        
        Estudiante est1 = new Estudiante ("Maria", 48987);
        Estudiante est2 = new Estudiante ("Juan", 89749);
        Estudiante est3 = new Estudiante ("Luis", 87944);
        Estudiante est4 = new Estudiante ("Julieta", 78545);
        
        Profesor pof1= new Profesor ("Romina Palmieri");
        Profesor pof2 = new Profesor ("Mariana Bracheta");
        Profesor pof3 = new Profesor ("Leon oscar");
       
        try{
            pof1.cantMaterias(2);
            pof2.cantMaterias(2);
            pof3.cantMaterias(4);
            pof1.dicta(c1);
            pof2.dicta(c2);
            pof3.dicta(c3);
            pof1.mostrarCursoqueDicta();
            pof2.mostrarCursoqueDicta();
            pof3.mostrarCursoqueDicta();
        }
        catch(ErrorInscripcion exc){
           System.out.println(exc.getMessage());
        }
        try{
            est1.cantInscriptos(1);
            est2.cantInscriptos(3);
            est3.cantInscriptos(2);
        
            est1.inscribir(c3);
            est2.inscribir(c3);
            est2.inscribir(c1);
            est2.inscribir(c2);
        
            est3.inscribir(c2);
            est3.inscribir(c3);
        
            est1.mostrarCurso();
            est2.mostrarCurso();
            est3.mostrarCurso();
        
            est4.cantInscriptos(8);
        }
        catch(ErrorInscripcion exc){
           System.out.println(exc.getMessage());
        }
       
        c1.CantdeInscriptos();
        c2.CantdeInscriptos();
        c3.CantdeInscriptos();
       
        c1.inscriptos();
        c2.inscriptos();
        c3.inscriptos();
        
        
        try{
            est1.cantInscriptos(5);            
        }
        catch (ErrorInscripcion estudiante){
            System.out.println(estudiante.getMessage());
        }
        
        Inscripcion.verificarInscripcionAlumno(est1, c1);
    }
}
