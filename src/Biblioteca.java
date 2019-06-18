
import java.util.*;

/*
 * 1. Considere una biblioteca pública. Indique y fundamente qué clases se pueden utilizar para 
 * almacenar temporalmente el contenido de la biblioteca y los ordenamientos que quisiera darle. 
 * Posteriormente, sugiera la mejor clase que se ajuste a la problemática.

 * 2. Realice un cuadro comparativo que considere las clases aprendidas para agrupar objetos, identificando claramente las características,
 * ventajas y desventajas, e indique al menos un caso donde puedan ser útiles.
 */

/**
 *
 * @author danielcortes
 */
public class Biblioteca {
    
    public static void main (String[]args){
            Libro resplandor = new Libro ("El resplandor","Stephen King",300,false);
            Libro jugador = new Libro ("El jugador","Iain Banks",377,false);
            Libro fundacion = new Libro ("Fundacion","Isaac Asimov",270,false);
            Libro aire = new Libro ("Aire","Geoff Ryman",428,false);
            Libro ocaso = new Libro ("Ocaso","Brendan Dubois",321,false);
            Libro otroJugador = new Libro ("El jugador","Iain Banks",377,true);
            
            
            HashSet miBiblioteca = new HashSet();
            miBiblioteca.add(resplandor);
            miBiblioteca.add(jugador);
            miBiblioteca.add(fundacion);
            miBiblioteca.add(aire);
            miBiblioteca.add(ocaso);
            miBiblioteca.add(otroJugador);
            
            System.out.println("Mi biblioteca tiene "+miBiblioteca.size()+" libros");
            
            Iterator iteradorLibros = miBiblioteca.iterator();
            while(iteradorLibros.hasNext()){
                Object objeto = iteradorLibros.next();
                Libro unLibro = (Libro)objeto;
                System.out.println("\t"+unLibro);
            }
    }    
}
