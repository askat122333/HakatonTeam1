package member;

import admin.Data;

import java.util.Scanner;

public class Member extends NewMember{
    public Member() {
    }

    public Member(String type) {
        super(type);
    }

    public Member(String name, String password) {
        super(name, password);
    }


    public static void ShowReceiver(){
        var members = Data.getMembers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое имя ");
        String name = scanner.next();
        System.out.println(members.get(name));


            }
    }
