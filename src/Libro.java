/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danielcortes
 */
public class Libro {
    private String nombre;
    private String autor; 
    private int paginas;
    private boolean prestado;
    
    
    public Libro (String nombre, String autor, int paginas,boolean prestado){
        this.nombre = nombre;
        this.autor=autor;
        this.paginas=paginas;
        this.prestado=prestado;
    }
    
    public String toString (){
        return ("Nombre : "+this.nombre+", Autor: "+this.autor+", Cantidad de paginas: "+this.paginas+", Prestado : "+this.prestado);
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }
    
    public boolean getPrestado(){
        return prestado;
    }
    
    public boolean equals (Object objeto){
        if (objeto==null) return false;
        
        Libro libro = (Libro)objeto;
        if  (this.getNombre().equals(libro.getNombre()))
            return true;
        return false;
    }
    
    public int hashCode(){
        return this.getNombre().hashCode()+this.getPaginas();
    }
    
}
