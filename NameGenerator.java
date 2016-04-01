/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    //Variables para el nombre en la pelicula
    private String apellido;
    private String nombre;
    //Variables para el apellido en la pelicula
    private String apellidoMadre;
    private String ciudadNac;
    // Valores estaticos para coger determinado numero de letras 
    private static final int COGER_2_LETRAS = 2;
    private static final int COGER_3_LETRAS = 3;
    private static final int POSICION_INICIAL = 0;

    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        String apellido= null; 
        String nombre= null;
        String apellidoMadre= null;
        String ciudadNac = null;
    }

    /**
     * Metodo que genera un nombre al estilo star Wars
     */
    public void generateStarsWarsName(String apellido, String nombre, String apellidoMadre, String ciudadNac)
    {
        String nombreStar = apellido.substring(POSICION_INICIAL,COGER_3_LETRAS) + nombre.substring(POSICION_INICIAL,COGER_3_LETRAS);         
        String apellidoStar = apellidoMadre.substring(POSICION_INICIAL,COGER_2_LETRAS) + ciudadNac.substring(POSICION_INICIAL,COGER_3_LETRAS);            
        System.out.println("Tu nombre en Star Wars: "+ nombreStar + " " + apellidoStar);
    }
}