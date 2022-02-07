package model;

import enums.MessageSubject;

import java.util.Objects;

public class Message {

    private MessageSubject subject;
    private String email;
    private String orderReference;
    private String message;

    public Message(MessageSubject subject, String email, String orderReference, String message) {
        this.subject = subject;
        this.email = email;
        this.orderReference = orderReference;
        this.message = message;
    }

    public MessageSubject getSubject() {
        return subject;
    }

    public void setSubject(MessageSubject subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message1 = (Message) o;
        return subject == message1.subject && Objects.equals(email, message1.email) && Objects.equals(orderReference, message1.orderReference) && Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, email, orderReference, message);
    }

    @Override
    public String toString() {
        return "Message{" +
                "subject=" + subject +
                ", email='" + email + '\'' +
                ", orderReference='" + orderReference + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
