package employee;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserInformationDaoImpl implements UserInformationDao {

    private static final ArrayList<Employee> memberList=new ArrayList<Employee>();


    @Override
    public void regist(Employee employee) {
        memberList.add(employee);
    }


    @Override
    public void makeANote(String fileName) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (int i = 0; i < memberList.size(); i++) {
                fileWriter.write(memberList.get(i).toString());
            }
            fileWriter.close();


        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
