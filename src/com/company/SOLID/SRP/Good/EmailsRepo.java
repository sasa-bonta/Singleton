package com.company.SOLID.SRP.Good;

import java.util.ArrayList;
import java.util.Collections;

public class EmailsRepo {

    EmailOperationsSRP emailOperation;
    ArrayList<String> emails = new ArrayList<String>();

    public EmailsRepo() {
        this.emails.add("zebra@gmail.com");
        this.emails.add("banana@yahoo.ru");
        this.emails.add("ananas@outlook.com");

        this.emailOperation = new EmailOperationsSRP();
    }

    public void add(String email) {
        if (emailOperation.verify(email)) {
            this.emails.add(email);
        }
    }

    public void sort() {
        Collections.sort(this.emails);
    }

    public void print() {
        for (String emailAddress : this.emails) {
            System.out.println(emailAddress);
        }
    }
}
