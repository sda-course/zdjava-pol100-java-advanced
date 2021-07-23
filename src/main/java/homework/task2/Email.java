package homework.task2;

import day1.model.Panel;

import java.util.regex.Pattern;

public class Email extends Message {
    final String emailAddress;
    final String subject;
    private final static Pattern emailPattern = Pattern.compile("[a-zA-Z]{3,}@[a-z]{2,}\\.[a-z.]{2,}");

    public Email(String content) {
        super(content);
        emailAddress = "";
        subject = "";
    }

    public Email(String content, String emailAddress, String subject) {
        super(content);
        this.emailAddress = emailAddress;
        this.subject = subject;
    }

    @Override
    public String send() {
        if (canSend()) {
            return "Mail o treści " + getContent() + " został wysłany na adres " + emailAddress;
        } else {
            return "Mail nie może zostać wysłany";
        }
    }

    @Override
    protected boolean canSend() {
        return super.canSend() && isValidEmail() && isValidSubject();
    }

    private boolean isValidEmail() {
        if (emailAddress == null || emailAddress.isEmpty() || emailAddress.length() < 5) {
            return false;
        }
        //return emailAddress.matches("[a-zA-Z]{3,}@[a-z]{2,}\\.[a-z.]{2,}");
        //lub lepiej, aby nie kompilowć wyrażenia regularnego z każdym wywołaniem
        return emailPattern.matcher(emailAddress).matches();
    }

    private boolean isValidSubject() {
        return subject != null && !subject.isEmpty();
    }
}
