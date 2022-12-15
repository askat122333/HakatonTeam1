package member;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserInformationDaoImpl implements UserInformationDao {

    public static ArrayList<NewMember> newMemberList =new ArrayList<NewMember>();


    @Override
    public void regist(NewMember newMember) {
        newMemberList.add(newMember);
    }


    @Override
    public void makeANote(String fileName) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (int i = 0; i < newMemberList.size(); i++) {
                fileWriter.write(newMemberList.get(i).toString());
            }
            fileWriter.close();


        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
