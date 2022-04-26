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

    // Un  método  escribe  que  grabará  el  contenido  del 
    // vector en un fichero de texto, cuyo nombre recibe 
    // el método como parámetro. Cada elemento del vector 
    // se convertirá en una línea del fichero.

    public void escribe(String fichero){
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < this.elementData.length; i++) {
                String linea = (String) this.elementData[i];
                if (linea != null) {
                    bw.write(linea);
                    bw.newLine();
                } 
                    
            }
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void inserta(String texto){
        // TODO Crear metodo inserta
        try {
            for (int i = 0; i < elementData.length; i++) {
                if (texto.compareTo((String) elementAt(i)) > 0) {
                    this.insertElementAt(texto, i+1);
                }else if (texto.compareTo((String) elementAt(i)) < 0) {
                    this.add(texto);
                }
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Que pasa???");
        }
    }
}
