
import java.io.File;


public class Entrada {

    public static void main(String[] args) {


        //1 ->Obtener todos los nombre de los ficheros del directorio llamado directorio
        System.out.println("Ejercicio1");
        File directorio = new File("src/resources/directorio");
        File[] ficheros = directorio.listFiles();
        for (File fichero : ficheros) {
            System.out.println(fichero.getName());
        }

        //2 -> Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero
        //   -> Obtener todos los nombre de los ficheros del directorio llamado directorio
        //   y el subdirectorio creado
        //Para ver lo que hay solo en el directorio2 

        System.out.println("Ejercicio2A");
        File directorio2 = new File("src/resources/directorio/directorio2");
        File[] subficheros = directorio2.listFiles();
        for (File subfichero : subficheros) {
            System.out.println(subfichero.getName());
        }
        //Para ver lo que hay en el directorio y el nombre del directorio2
        System.out.println("Ejercicio2");
        File directorioPadre = new File(directorio2.getParent());

        File[] subficherosYFicheros = directorioPadre.listFiles();
        for (File subficheroYFichero : subficherosYFicheros) {
            System.out.println(subficheroYFichero.getName());
        }


        // 3 -> Listar el nombre de todos los ficheros del SISTEMA ( C:/User o /Users )
        System.out.println("Ejercicio3");
        directorioSistema("C:\\Users");

    }


    public static void directorioSistema(String ruta){
        File ficherosSistema = new File(ruta);

        if(ficherosSistema.isDirectory()){
            File [] archivos = ficherosSistema.listFiles();
            if(archivos!=null){
                for(File archivo: archivos){
                    if(archivo.isFile()){
                        System.out.println(archivo.getName());
                    } else if (archivo.isDirectory()) {
                        System.out.println(archivo.getName());
                        directorioSistema(archivo.getAbsolutePath());

                    }
                }
            }



        }


    }
}




