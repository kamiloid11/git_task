package ru.git_task;

public class Message {
    private User sender;
    private User recipient;
    private String textMessage;
    private String timeAndDate;

    public Message() {}

    public Message(User sender, User recipient, String textMessage,String timeAndDate) {
        this.sender = sender;
        this.recipient = recipient;
        this.textMessage = textMessage;
        this.timeAndDate = timeAndDate;
    }

    //Gets
    public String getTextMessage() {
        return textMessage;
    }

    public User getRecipient() {
        return recipient;
    }

    public User getSender() {
        return sender;
    }

    public String getTimeAndDate() {
        return timeAndDate;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    //Sets


    public void setRecipient(User recipient) {
        this.recipient = recipient;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public void setTimeAndDate(String timeAndDate) {
        this.timeAndDate = timeAndDate;
    }

    public void printMessage() {
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Text: " + textMessage);
        System.out.println("Date and time: " + timeAndDate);
    }
}
