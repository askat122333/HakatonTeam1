import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private static ArrayList<String>data = new ArrayList<>();
    private static ArrayList<String>passwords;

    public static ArrayList<String> getData() {
        return data;
    }

    public static ArrayList<String> getPasswords() {
        return passwords;
    }

    public void addInstruction() {
        String text = Admin.addInstructions();
        data.add(text);
    }
    public void getInstruction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер инструкции (начинается с 0):");
        int count = scanner.nextInt();
        System.out.println(data.get(count)+"\n");
    }
}
