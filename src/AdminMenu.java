import java.util.Scanner;

public class AdminMenu {
    public static void main(Admin admin){
        Data data = new Data();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Это меню админа , здесь можно добавить инструкции к игре и ее правилам\n" +
                    "Выберите номер из меню :\n"+
          "1) Добавить инструкции\n"
                    + "2) Указать максимальную стоимость\n"+
                   "3) Указать дату окончания\n"+
                   "4) Распределить игроков\n"+
                    "5)");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    data.addInstruction();
                    break;
                case 2:
            }


        }
    }
}
