package com.company.SOLID.SRP.Bad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WrongEmailChecker {

    ArrayList<String> emails = new ArrayList<String>();

    public WrongEmailChecker() {
        this.emails.add("zebra@gmail.com");
        this.emails.add("banana@yahoo.ru");
        this.emails.add("ananas@outlook.com");
    }

    public void verifyAddSortPrint(String email) {

        // verify
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);
        if (mat.matches()) {
            System.out.println("This is email address");
        } else {
            System.out.println("This is not an email address");
        }

        // add
        if (mat.matches()) {
            this.emails.add(email);
        }

        // sort
        Collections.sort(this.emails);

        // print
        for (String emailAddress : this.emails) {
            System.out.println(emailAddress);
        }
    }
}
