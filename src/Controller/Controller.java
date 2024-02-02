package Controller;
import User.User;

public class Controller {

   static User user;
    public static void main(String[] args){
        User.preguntas();
    }
    public Controller(User user) {
        Controller.user = user;
        User.preguntas();
    }
}
