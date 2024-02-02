package User;
import java.sql.SQLOutput;
import java.util.Scanner;
public class User {
    static Scanner lector = new Scanner(System.in);
    static String nombre;
    static String apellido;
    static int numero;
    static String foto;
    boolean ponerFoto;

    public static void preguntas(boolean ponerFoto){

        ponerFoto = false;

        System.out.println("Nombre: ");
        nombre = lector.nextLine();

        System.out.println("Apellido: ");
        apellido = lector.nextLine();

        System.out.println("Numero de telefono: ");
        numero = lector.nextInt();

        System.out.println("Quieres añadir una foto? (Si o No): ");
        foto = lector.nextLine();

        if(foto.equals("Si")) {
            ponerFoto = true;
        }
    }
}
