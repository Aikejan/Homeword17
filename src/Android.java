public class Android extends  Java{
    private String name;
    private  int age;
    private String gender;
    private String email;

    public Android(String name, int age, String gender, String email, String name1, int age1, String gender1, String email1) {
        super(name, age, gender, email);
        this.name = name1;
        this.age = age1;
        this.gender = gender1;
        this.email = email1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name=: " + name +
                ", age: " + age +
                ", gender: '" + gender +
                ", email: " + email;
    }
}
