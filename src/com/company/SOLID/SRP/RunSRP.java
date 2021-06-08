package com.company.SOLID.SRP;

import com.company.SOLID.SRP.Bad.WrongEmailChecker;
import com.company.SOLID.SRP.Good.EmailOperationsSRP;
import com.company.SOLID.SRP.Good.EmailsRepo;

public class RunSRP {

    public static void main(String[] args) {
        WrongEmailChecker badExample = new WrongEmailChecker();
        badExample.verifyAddSortPrint("newemail@gmail.com");

        EmailOperationsSRP goodExample = new EmailOperationsSRP();
        EmailsRepo repo = new EmailsRepo();
        repo.add("newemail@gmail.com");
        repo.sort();
        repo.print();
    }
}
