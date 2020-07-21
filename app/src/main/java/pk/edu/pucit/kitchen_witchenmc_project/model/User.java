package pk.edu.pucit.kitchen_witchenmc_project.model;

public class User {
    private String name;
    private String mail;
    private String password;
    public User(){

    }
    public User(String usrName, String usrMail, String usrPass){
        name=usrName;
        mail=usrMail;
        password=usrPass;
    }

    public User(String mail, String pass) {
        this.mail=mail;
        password=pass;
        name=null;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName(){
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
