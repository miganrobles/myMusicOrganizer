
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 *  Clase Test nos permite probar los métodos checkIndex, validIndex, listFile y removeFile sin tener que usar la interfaz de BlueJ.
 */
public class Test
{
    /**
     * Este método nos permiter hacer un test a el método checkIndex de la clase MusicOrganizer.
     */
    public void testChekIndex()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del método checkIndex:");
        System.out.println();
        System.out.println("Realizamos un chequeo de un índice cuando no tenemos ningún elemento en nuestra colección:");
        System.out.println();
        organizador.checkIndex(0);
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("Rock & Roll Star.mp3");
        System.out.println("Este resultado se nos muestra cuando la colección contiene un elemento"); 
        System.out.println("y el valor del indice introducido está fuera del rango [5]:");
        System.out.println();
        organizador.checkIndex(5);
        System.out.println("#############################################################");
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Este resultado se nos muestra cuando la colección contiene cuatro elementos"); 
        System.out.println("y el valor del indice introducido está fuera del rango [5]:");
        System.out.println();
        organizador.checkIndex(5);
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Este resultado se nos muestra cuando la colección contiene cuatro elementos"); 
        System.out.println("y el valor del indice introducido está dentro del rango [3]:");
        System.out.println();
        organizador.checkIndex(3);
        System.out.println();
    }

    /**
     * Este método nos permiter hacer un test a el método validIndex de la clase MusicOrganizer
     */
    public void testValidIndex()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del método validIndex:");
        System.out.println();
        System.out.println("Comprobamos la valided de un índice y no tenemos ningún elemento en nuestra colección:");
        System.out.println();
        System.out.println("Valor devuelto: " + organizador.validIndex(5));
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Comprobamos la valided de un índice cuando la colección contiene tres elementos"); 
        System.out.println("y el valor del indice introducido está fuera del rango [5]:");
        System.out.println();
        System.out.println("Valor devuelto: " + organizador.validIndex(5));
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Comprobamos la valided de un índice cuando la colección contiene tres elementos"); 
        System.out.println("y el valor del indice introducido está dentro del rango [2]:");
        System.out.println();
        System.out.println("Valor devuelto: " + organizador.validIndex(2));
        System.out.println();
    }

    /**
     * Este método nos permiter hacer un test a el método listFile de la clase MusicOrganizer
     */
    public void testListFile()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del método listFile:");
        System.out.println();
        System.out.println("Intentamos visualizar el nombre de un fichero mp3 cuando nuestra colección está vacía (no nos muestra nada):");
        System.out.println();
        organizador.listFile(2);
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Intentamos visualizar el nombre de un fichero mp3 cuando la colección contiene tres ficheros"); 
        System.out.println("y el valor del indice introducido está fuera del rango [5] (no nos muestra nada):");
        System.out.println();
        organizador.listFile(5);
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Intentamos visualizar el nombre de un fichero cuando la colección contiene tres ficheros"); 
        System.out.println("y el valor del indice introducido está dentro del rango [2]:");
        System.out.println();
        organizador.listFile(2);
        System.out.println();
    }

    /**
     * Este método nos permiter hacer un test a el método removeFile de la clase MusicOrganizer
     */
    public void testRemoveFile()
    {
        MusicOrganizer organizador = new MusicOrganizer();
        System.out.println("Test del método removeFile:");
        System.out.println();
        System.out.println("Intentamos borrar un elemento cuando nuestra colección está vacía (no hace nada):");
        System.out.println();
        organizador.removeFile(2);
        System.out.println("#############################################################");
        System.out.println();
        organizador.addFile("The wall.mp3");
        organizador.addFile("Revolution.mp3");
        organizador.addFile("Woman.mp3");
        System.out.println("Intentamos borrar un fichero cuando la colección contiene tres ficheros"); 
        System.out.println("y el valor del indice introducido está fuera del rango [5] (no hace nada):");
        System.out.println();
        organizador.removeFile(5);
        System.out.println("#############################################################");
        System.out.println();
        System.out.println("Mostramos un listado de todos los ficheros");
        for (int valor = 0; valor < organizador.getNumberOfFiles(); valor ++ ) {//Aunque no hemos visto esta opción, queda mejor la presentacion del ejercicio.
            organizador.listFile(valor);
        }
        System.out.println();
        System.out.println("Borramos el fichero con indice nº 1: ");
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
