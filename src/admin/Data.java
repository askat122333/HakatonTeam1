package admin;

import admin.Admin;

import java.util.*;

public class Data {
    private static ArrayList<String> instruction = new ArrayList<>();
    private static Map<String,String> members = new HashMap<>();

    public static Map<String, String> getMembers() {
        return members;
    } public static void setMembers(Map<String, String> map) {
        members=map;
    }

    public static void addInstruction() {
        String text = Admin.addInstructions();
        instruction.add(text);
        System.out.println("Инструкции успешно добавлены!\n");
    }

    public static void getInstruction() {
        System.out.println("Инстуркции к игре: ");
        for (int i = 0; i < instruction.size(); i++) {
            if (instruction.get(i) != null) {
                System.out.println(instruction.get(i));
            }else if(instruction.get(i).isEmpty()){
                System.out.println("Нет инструкций");
            }

        }
    }
}
