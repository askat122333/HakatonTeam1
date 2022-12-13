import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Admin extends AbstractStaff{
    private static String login = "Admin1122";
    private static String adminPassword = "aDmiN12#@";
    public Admin(String surName, String name, int age, Role role, String password) {
        super(surName, name, age, role, password);
    }

    public static String getLogin() {
        return login;
    }

    public static String getAdminPassword() {
        return adminPassword;
    }

    public Admin() {
    }


    public static String addInstructions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте инструкции:");
        String text = scanner.next();
        return text;
    }
}
