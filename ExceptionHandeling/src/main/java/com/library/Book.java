package com.library;

import java.io.FileNotFoundException;

public class Book {

    public void enterBookName() {
        String bookName = "Famous Five-Five on a treasure island";

        try {
            if (bookName.equals("Famous Five-Five on a treasure island")) ;
            Fine fine = new Fine();
            fine.calculateFine(-1);
        } catch (NullPointerException nullPointerException) {
            System.out.println("The book is referencing to the null value");
        }
    }

    public void getInformation() throws FileNotFoundException {
        Fine fine = new Fine();
        fine.getInformation();
    }

    public void getNumberOfBooks() throws ArithmeticException {
        int noOfBooks = 10;
        int numberOfMembers = 0;
        int bookPerMember = noOfBooks / numberOfMembers;

    }
}
