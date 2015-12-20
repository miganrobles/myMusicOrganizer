
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *  Clase Test nos permite probar los m�todos checkIndex, validIndex, listFile y removeFile sin tener que usar la interfaz de BlueJ.
 */
public class Test
{
    /**
     * Este m�todo nos permiter hacer un test a el m�todo checkIndex de la clase MusicOrganizer.
     */
    public void testChekIndex()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del m�todo checkIndex:");
        System.out.println();
        System.out.println("Realizamos un chequeo de un �ndice cuando no tenemos ning�n elemento en nuestra colecci�n:");
        System.out.println();
        organizador.checkIndex(0);
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("Rock & Roll Star.mp3");
        System.out.println("Este resultado se nos muestra cuando la colecci�n contiene un elemento"); 
        System.out.println("y el valor del indice introducido est� fuera del rango [5]:");
        System.out.println();
        organizador.checkIndex(5);
        System.out.println("#############################################################");
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Este resultado se nos muestra cuando la colecci�n contiene cuatro elementos"); 
        System.out.println("y el valor del indice introducido est� fuera del rango [5]:");
        System.out.println();
        organizador.checkIndex(5);
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Este resultado se nos muestra cuando la colecci�n contiene cuatro elementos"); 
        System.out.println("y el valor del indice introducido est� dentro del rango [3]:");
        System.out.println();
        organizador.checkIndex(3);
        System.out.println();
    }

    /**
     * Este m�todo nos permiter hacer un test a el m�todo validIndex de la clase MusicOrganizer
     */
    public void testValidIndex()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del m�todo validIndex:");
        System.out.println();
        System.out.println("Comprobamos la valided de un �ndice y no tenemos ning�n elemento en nuestra colecci�n:");
        System.out.println();
        System.out.println("Valor devuelto: " + organizador.validIndex(5));
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Comprobamos la valided de un �ndice cuando la colecci�n contiene tres elementos"); 
        System.out.println("y el valor del indice introducido est� fuera del rango [5]:");
        System.out.println();
        System.out.println("Valor devuelto: " + organizador.validIndex(5));
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Comprobamos la valided de un �ndice cuando la colecci�n contiene tres elementos"); 
        System.out.println("y el valor del indice introducido est� dentro del rango [2]:");
        System.out.println();
        System.out.println("Valor devuelto: " + organizador.validIndex(2));
        System.out.println();
    }

    /**
     * Este m�todo nos permiter hacer un test a el m�todo listFile de la clase MusicOrganizer
     */
    public void testListFile()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del m�todo listFile:");
        System.out.println();
        System.out.println("Intentamos visualizar el nombre de un fichero mp3 cuando nuestra colecci�n est� vac�a (no nos muestra nada):");
        System.out.println();
        organizador.listFile(2);
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Intentamos visualizar el nombre de un fichero mp3 cuando la colecci�n contiene tres ficheros"); 
        System.out.println("y el valor del indice introducido est� fuera del rango [5] (no nos muestra nada):");
        System.out.println();
        organizador.listFile(5);
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Intentamos visualizar el nombre de un fichero cuando la colecci�n contiene tres ficheros"); 
        System.out.println("y el valor del indice introducido est� dentro del rango [2]:");
        System.out.println();
        organizador.listFile(2);
        System.out.println();
    }

    /**
     * Este m�todo nos permiter hacer un test a el m�todo removeFile de la clase MusicOrganizer
     */
    public void testRemoveFile()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del m�todo removeFile:");
        System.out.println();
        System.out.println("Intentamos borrar un elemento cuando nuestra colecci�n est� vac�a (no hace nada):");
        System.out.println();
        organizador.removeFile(2);
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Intentamos borrar un fichero cuando la colecci�n contiene tres ficheros"); 
        System.out.println("y el valor del indice introducido est� fuera del rango [5] (no hace nada):");
        System.out.println();
        organizador.removeFile(5);
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Mostramos un listado de todos los ficheros");
        for (int valor = 0; valor < organizador.getNumberOfFiles(); valor ++ ) {//Aunque no hemos visto esta opci�n, queda mejor la presentacion del ejercicio.
            organizador.listFile(valor);
        }
        System.out.println();
        System.out.println("Borramos el fichero con indice n� 1: ");
        organizador.listFile(1);
        organizador.removeFile(1);
        System.out.println();
        System.out.println("Volvemos a mostrar un lisado de los ficheros y comprobamos que el fichero se ha borrado y hay otro en su lugar:");
        for (int valor = 0; valor < organizador.getNumberOfFiles(); valor ++ ) {
            organizador.listFile(valor);
        }
        System.out.println();
    }
}
