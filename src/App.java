public class App {
    public static void main(String[] args) throws Exception {
        String fichero = "E:/DAM/Programacion/Java/Ejercicios iniciales/Practica6_Ficheros_MarioDeSantiago/text.txt";
        String ficheroEscrito = "E:/DAM/Programacion/Java/Ejercicios iniciales/Practica6_Ficheros_MarioDeSantiago/textoEscrito.txt";
        String texto = "Mario";
        VectorStrings v = new VectorStrings(fichero);
        System.out.println(v);

        v.escribe(ficheroEscrito);
        v.inserta(texto);

        System.out.println(v);

    }
}
