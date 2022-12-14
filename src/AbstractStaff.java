public abstract class AbstractStaff{
    private String surName;
    private String name;
    private int age;
    private Role role;

    public AbstractStaff(String surName, String name, int age, Role role) {
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.role = role;
    }
    public AbstractStaff(){}

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
