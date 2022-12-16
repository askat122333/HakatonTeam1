package member;

public class NewMember {
    private String name;
    private String password;
    private String receiver;

    private String type;

    public NewMember() {

    }

    public NewMember(String name, String password, String receiver, String type) {
        this.name = name;
        this.password = password;
        this.receiver = receiver;
        this.type = type;
    }

    public NewMember(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public NewMember(String type) {
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Участник[" +
                "Имя – " + name +
                ", Категория желаемого подарка – " + type +
                "]\n";
    }
}
