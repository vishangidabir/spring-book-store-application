package com.bridgelabz.bookstore.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    JavaMailSender javaMailSender;

    public void sendEmail(String toEmail, String subject, String body) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("vishangi30@gmail.com");
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setText(body);
        simpleMailMessage.setSubject(subject);

        javaMailSender.send(simpleMailMessage);
        System.out.println("Mail Sent successfully");
    }

}
