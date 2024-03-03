package mysql.models;

public class Customer {
    private int id;
    private String name;
    private int age;
    private String mailAddress;
    private String password;

    public Customer (int id, String name, int age, String mailAddress, String password){
        this.id = id;
        this.name = name;
        this.age = age;
        this.mailAddress = mailAddress;
        this.password = password;
    }

    public Customer() {} ;

    public int getId() {
        return id;
    }

    public void setId (int id){
        this.id = id;
    }

    public String getName(){
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

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
