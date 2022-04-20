import java.io.*;
import java.util.Vector;

public class VectorStrings extends Vector {
    // Como sabemos java dispone de la clase genérica
    // java.util.Vector que sirve para almacenar elementos
    // del mismo tipo. Queremos escribir una clase
    // VectorStrings, parte de un paquete utilidades,
    // específica para almacenar cadenas de caracteres
    // (Strings).

    // a) constructor vacío
    public VectorStrings(){

    }

    // Constructor con parámetro string con el nombre del fichero de texto. Inicializa el vector con los elementos del fichero linea a linea. Si el fichero no existe, lanza una excepción FileNotFoundException y crea el vector vacio.
    public VectorStrings(String fichero){
        try{
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine()) != null){
                this.addElement(linea);
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println("El fichero no existe");
        }catch(IOException e){
            System.out.println("Error de entrada/salida");
        }
    }
    
}
