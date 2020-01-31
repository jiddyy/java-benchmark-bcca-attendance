package app;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        SignInSheet newForm = signIn();
        signUserIn(newForm);
    }

    private static void signUserIn(SignInSheet newForm) {
        try {
            FileOutputStream fileStream = new FileOutputStream("signInLog.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(newForm);
            os.close();
        } catch (IOException ex) {
            System.out.println("Failed to sign in.");
        }
    }

    public static SignInSheet signIn() {
        System.out.println("Welcome back to Base Camp! Sign in with your name: ");
        String name = input.nextLine();
        System.out.println("Day: ");
        String day = input.nextLine();
        System.out.println("Time: ");
        String time = input.nextLine();
        System.out.println("Thank you.");
        return new SignInSheet(name, day, time);
    }
}