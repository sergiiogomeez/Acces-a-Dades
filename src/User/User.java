package User;
import java.sql.SQLOutput;
import java.util.Scanner;
public class User {
    static Scanner lector = new Scanner(System.in);
    static String nombre;
    static String apellido;
    static int numero;
    static String foto;

    public static void main(String[] args){
        preguntas();
    }
    public static void preguntas(){
        boolean ponerFoto;
        System.out.print("Nombre: ");
        nombre = lector.nextLine();

        System.out.print("Apellido: ");
        apellido = lector.nextLine();

        System.out.print("Numero de telefono: ");
        numero = lector.nextInt();

        System.out.print("Quieres añadir una foto? (Si o No): ");
        foto = lector.nextLine();

        if(foto.equals("Si")) {
            ponerFoto = true;
            System.out.print("Se añadira una foto");
        }else{
            ponerFoto = false;
        }
    }
}
