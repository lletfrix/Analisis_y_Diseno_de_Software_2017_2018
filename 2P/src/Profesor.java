import java.util.ArrayList;
/**
* Clase Profesor en la que almacenamos todos los datos requeridos, y los metodos necesarios para poder
* mostrar la informacion requerida en el apartado 4 opcional de la practica 2. No se implementa la clase
* persona por simplicidad del codigo aunque esta este reflejada en el diagrama de clases.
* @author Rafael Sanchez Sanchez y Sergio Galan Martin: rafael.sanchez@estudiante.uam.es y sergio.galanm@estudiante.uam.es
*/
public class Profesor{
    private String numSS;
    private float salario;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private ArrayList<Contrato> contratos;
    /**
     * Constructor de la clase Profesor
     * @param numSS Numero de la Seguridad Social del profesor
     * @param salario Salario del profesor
     * @param nombre Nombre de Profesor
     * @param apellidos Apellidos del Profesor
     * @param dni Dni del Profesor
     * @param telefono Telefono del Profesor
     */
    public Profesor(String numSS, float salario, String nombre, String apellidos, String dni, String telefono){
        this.numSS = numSS;
        this.salario = salario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.contratos = new ArrayList<Contrato>();
    }

    /**
     * Anade un nuevo Contrato a la lista de Contratos del profesor (Devuelve el propio Profesor para permitir multiples adiciones seguidas)
     * @param contrato Contrato a anadir a la lista
     * @return El propio Profesor
     */
    public Profesor addContrato(Contrato contrato){
        this.contratos.add(contrato);
        return this;
    }

    /**
     * Imprime toda la informacion relativa a las Autoescuelas y periodos en los que ha trabajado en ellas el Profesor
     */
    public void printInformacion(){
        for (Contrato contrato : contratos){
            System.out.println("El profesor " + this.nombre + " " + this.apellidos +
            " ha trabajado en la autoescuela " + contrato.getAutoescuela().getNombre() + " desde el " +
            contrato.getFechaInic() + " hasta el " + contrato.getFechaFin() + "\n");
        }
    }

    /**
     * Getter del nombre del Profesor
     * @return String que contiene el nombre del profesor
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Getter de los apellidos del Profesor
     * @return String que contiene los apellidos del Profesor
     */
    public String getApellidos(){
        return this.apellidos;
    }
}
