package com.alfabank.work11;

public class Runner {
    public void run() {
        Book bookMan = new Book();
        bookMan.setId(1);
        bookMan.setAuthor("Bulgakov");
        bookMan.setPages(500);
        bookMan.setPrice(125.5);
        bookMan.setPublisher("Rafinery");
        bookMan.setYear(2000);
        bookMan.view();
        Book book = new Book("Bulgakov", "Master of puppest", "Rafinery");
        book.view();
        Book fullBook = new Book(1, "Bulgakov", "Master of puppest", "Rafinery", 1998, 550, 250.5);
        fullBook.view();
        Book bookList = new Book();
        bookList.printBooksList(bookList.bookList());

        bookList.printBooksList(bookList.increaseBookPrice(bookList.bookList()));

        Book[] booksByAuthor = bookList.getBooksByAuthor(bookList.bookList());
        if (booksByAuthor.length > 0) {
            bookList.printBooksList(booksByAuthor);
        } else {
            System.out.println("Не знайдено творів введеного автора");
        }

        Book[] booksByYear = bookList.getBooksByYear(bookList.bookList());
        if (booksByYear.length > 0) {
            bookList.printBooksList(booksByYear);
        } else {
            System.out.println("Не знайдено книг опублікованих після введеного року");
        }

        Book[] booksByPublisher = bookList.getBooksByPublisher(bookList.bookList());
        if (booksByPublisher.length > 0) {
            bookList.printBooksList(booksByPublisher);
        } else {
            System.out.println("Не знайдено книг по даному видавництву");
        }
    }
}
