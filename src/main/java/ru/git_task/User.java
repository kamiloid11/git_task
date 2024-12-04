package ru.git_task;

public class User {
    private String username;
    private String name;
    private String number;
    private String password;


    public User() {}


    public User(String username, String name, String number, String password){
        this.username = username;
        this.name = name;
        this.number = number;
        this.password = password;
    }



    public String getUsername(){
        return username;
    }
    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
    public String getPassword(){
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void printUser(){
        System.out.println(username + "/n" + name + "/n" + number + "/n" + password);
    }
}
