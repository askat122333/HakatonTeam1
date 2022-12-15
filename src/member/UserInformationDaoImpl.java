package member;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserInformationDaoImpl implements UserInformationDao {

    public static ArrayList<Member> memberList=new ArrayList<Member>();


    @Override
    public void regist(Member member) {
        memberList.add(member);
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
