public class Staff extends AbstractStaff implements Registration{
    private String giftCategory;
    private String login;
    public Staff(String surName, String name, int age, Role role) {
        super(surName, name, age, role);

    }

    @Override
    public void registration() {

    }
}
