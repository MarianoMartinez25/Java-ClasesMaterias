
package Miembros;
import Asignaturas.Curso;
import Asignaturas.ErrorInscripcion;

public class Profesor extends Persona{
    
    private Curso docente[];
    
    public Profesor (String nombre){
        super(nombre);
    }
    
    public void dicta( Curso c ){
        for(int i=0; i<docente.length;i++){
            if(docente == null){
                docente[i]= c;
            }
        }
    }
       
    public void mostrarCursoqueDicta (){
        System.out.println("El Profesor/a "+getnombre()+" dicta clases en el curso ");
        for(Curso docente1: docente){
            System.out.println("-" + docente1.gettitulo());
        }
    }
    
    public void cantMaterias(int e) throws ErrorInscripcion {
        
        switch(e){
            case 1: System.out.println(nombre + " dicta 1 curso");
                docente = new Curso[e];
                break;
            case 2: System.out.println( nombre + " dicta 2 cursos");
                docente = new Curso[e];
                break;
            default: throw new ErrorInscripcion( nombre +
                        " no se pueden dictar mas de 2 cursos "
                                + "y usted quiere dictar " + e);
        }
        
    }
    
}
