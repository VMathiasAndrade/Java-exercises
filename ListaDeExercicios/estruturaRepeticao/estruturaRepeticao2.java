package ListaDeExercicios.estruturaRepeticao;


// Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário,
// mostrando uma mensagem de erro e voltando a pedir as informações.
import java.util.*;

public class estruturaRepeticao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter your username: ");
        String user = sc.next();
        System.out.printf("Enter your password: ");
        String password = sc.next();

        while (user.equals(password)) {
            System.out.println("Your password cannot be the same as your username. Enter another, please: ");
            password = sc.next();
        }

        System.out.println("Account succesfully created!");
    }
}
