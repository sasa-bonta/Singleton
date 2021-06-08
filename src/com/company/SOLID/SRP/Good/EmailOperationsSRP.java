package com.company.SOLID.SRP.Good;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailOperationsSRP {

    public EmailOperationsSRP() {
    }

    public boolean verify(String email) {
        Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
        Matcher mat = pattern.matcher(email);
        if (mat.matches()) {
            System.out.println("This is email address");
            return true;
        } else {
            System.out.println("This is not an email address");
            return false;
        }
    }
}
