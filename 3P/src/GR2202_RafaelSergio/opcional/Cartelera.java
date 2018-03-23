package GR2202_RafaelSergio.opcional;
import GR2202_RafaelSergio.practica3.Genero;
import GR2202_RafaelSergio.practica3.Pelicula;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Cartelera implementada para cumplir la funcionalidad especificada en la
 * Práctica 3 de ADSOF
 * @author Rafael Sánchez Sánchez y Sergio Galán Martín: rafael.sanchez@estudiante.uam.es y sergio.galanm@estudiante.uam.es
 *
 */
 public class Cartelera {
    private ArrayList<Pelicula> peliculas;
    public Cartelera() {
        this.peliculas = new ArrayList<Pelicula>();
    }
    /**
     * Getter de la lista de Películas de la Cartelera
     * @return Lista de Películas de la Cartelera
     */
    public List<Pelicula> getPeliculas(){
        return this.peliculas;
    }
    /**
     * Método para añadir una Película a la lista de Películas de la Cartelera dado un objeto Película
     * @param p Película a añadir a la lista
     * @return Película añadida a la Cartelera
     */
    public Pelicula addPelicula(Pelicula p){
        this.peliculas.add(p);
        return p;
    }
    /**
     * Método para añadir una Película a la lista de Películas de la Cartelera dados sus atributos
     * @param titulo Nombre de la Película
     * @param director Nombre del director de la Película
     * @param anno Año de la Película
     * @param sinopsis Sinopsis de la Película
     * @param genero Género de la película
     * @return Película añadida a la Cartelera
     */
    public Pelicula addPelicula(String titulo, String director, String anno, String sinopsis, Genero genero){
        Pelicula p = new Pelicula(titulo, director, anno, sinopsis, genero);
        if(this.peliculas.contains(p)){
            return null;
        }
        return this.addPelicula(p);
    }
    /**
     * Método para eliminar una Película concreta de la Cartelera
     * @param pelicula Película a eliminar de la Cartelera
     * @return Booleano que representa el éxito o fracaso de la operación
     */
    public boolean removePelicula(Pelicula pelicula){
        int i=0;
        if (!this.peliculas.contains(pelicula)){
            System.out.println("La pelicula no existe");
            return false;
        }
        for (Pelicula p : this.peliculas){
            if(p.equals(pelicula)){
                p.remove();
                this.peliculas.remove(i);
                return true;
            }
            ++i;
        }
        return false;
    }
    /**
     * Método para mostrar los datos de todas las Películas que hay en Cartelera
     */
    public void showPeliculas(){
        //String res = "";
        for (Pelicula pelicula : this.peliculas) {
            System.out.println(pelicula);
        }
    }
}