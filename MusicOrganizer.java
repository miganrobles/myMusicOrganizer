import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Este m�todo toma un par�metro entero y comprueba que sea un �ndice v�lido para el atributo files, 
     * siempre que halla alg�n valor en nuestro indice.
     * Si el par�metro no es v�lido debe mostrar un mensaje de error por pantalla e indicar el rango v�lido. 
     */
    public void checkIndex(int index) {
        String badIndice = "El valor introducido no es un �ndice v�lido, ";
        if (getNumberOfFiles() == 0) { //Si no tenemos ning�n fichero en nuestra coleccion no deber�a comprobar el valor y nos avisa de ello.
            System.out.println(badIndice + "no hay ning�n fichero en nuestra colecci�n de m�sica.");
        }
        else if (!(index >= 0 && index < files.size())) { //Comprueba si el valor no est� dentro del rango cuando hay alg�n fichero en nuestta colecci�n.
            String rango = "solo puede introducir el 0 como valor para el incice.";//Cuando solo hay un fichero solo puede introducir el 0, no hay rango.
            if (files.size() > 1) { //Si hay m�s de un fichero existe un rango.
                rango = "debe de introducir un valor entre 0 y " + (files.size() - 1) + " ambos inclu�dos.";//Muestra el rango.
            } 
            System.out.println(badIndice + rango);
        }
    }

    /**
     * Este m�todo devuleve un valor booleano en funci�n de si su par�metro entero es un 
     * �ndice v�lido (true) o no (false) para el.
     */
    public boolean validIndex(int index) {
        boolean valorDevuelto = false;
        if ((index >= 0 && index < files.size())) {
            valorDevuelto = true;
        }
        return valorDevuelto;
    }
}
