package ru.git_task;

public class Main {
    public static void main(String args[]) {
        User user1 = new User("None", "Kamil", "123456789", "password");
        User user2 = new User("None", "Karina", "123456789", "password");
        User user3 = new User("None", "Karina", "123456789", "password");
        User user4 = new User("None", "Galina", "123456789", "password");
        Message message1 = new Message(user1, user2, "ogjhfhfjklg", "12.12.12");
        Message message2 = new Message(user2, user3, "ogjhfhfjklg", "12.12.12");
        Message message3 = new Message(user3, user4, "ogjhfhfjklg", "12.12.12");
        Message message4 = new Message(user4, user1, "ogjhfhfjklg", "12.12.12");
        user1.printUser();
        message1.printMessage();
        user2.printUser();
        message2.printMessage();
        user3.printUser();
        message3.printMessage();
        user4.printUser();
        message4.printMessage();
    }
}