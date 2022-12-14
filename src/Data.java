import java.util.*;

public class Data {
    private static ArrayList<String> instruction = new ArrayList<>();
    private static Map<String,String> Staff = new HashMap<>();
    public static void addInstruction() {
        String text = Admin.addInstructions();
        instruction.add(text);
    }

    public static void getInstruction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер инструкции (начинается с 0):");
        int count = scanner.nextInt();
        System.out.println(instruction.get(count)+"\n");
    }
}
