package com.alfabank.work11;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Book {

    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";

    private int id;
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int pages;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {
        System.out.println(id + " " + author + " " + title + " " + publisher + " " + year + " " + pages + " " + price);
    }

    public Book() {
    }

    public Book(String author, String title, String publisher) {
        this.author = author;
        this.title = title;
        this.publisher = publisher;
    }

    public Book(int id, String author, String title, String publisher, int year, int pages, double price) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Book[] bookList() {
        Book[] bookList = new Book[10];
        bookList[0] = new Book(1, "John Tolkien", "The Lord of the Rings", "George Allen", 1954, 600, 150);
        bookList[1] = new Book(2, "Douglas Adams", "The Hitchhiker's Guide to the Galaxy", "Pan Books", 1979, 128, 125.50);
        bookList[2] = new Book(3, "Harper Lee", "To Kill a Mockingbird", "Lippincott", 1960, 281, 175.25);
        bookList[3] = new Book(4, "Alan Milne", "Winnie Pooh", "Pooh", 1926, 325, 220);
        bookList[4] = new Book(5, "Franklin Herbert", "Dune", "Chilton Books", 1965, 656, 352.25);
        bookList[5] = new Book(6, "Robert Stevenson", "Treasure Island", "Island", 1883, 352, 111.10);
        bookList[6] = new Book(7, "JFrancis Fitzgerald", "The Great Gatsby", "Gatsby", 1925, 325, 175);
        bookList[7] = new Book(8, "George Orwell", "Animal Farm", "Farm", 1954, 290, 189.55);
        bookList[8] = new Book(9, "Mario Puzo", "The Godfather", "Godfather", 1969, 680, 185);
        bookList[9] = new Book(10, "Bram Stoker", "Dracula", "Archibald Constable", 1954, 418, 150);
        return bookList;
    }

    public void printBooksList(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].id + " "
                    + books[i].author + " "
                    + books[i].title + " "
                    + books[i].publisher + " "
                    + books[i].year + " "
                    + books[i].pages + " "
                    + books[i].price);
        }
    }

    public Book[] increaseBookPrice(Book[] books) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_GREEN + "Введіть будь-яке ціле число від 1 до 100: " + ANSI_RESET);
        if (scanner.hasNextInt()) {
        int percent = scanner.nextInt();
        System.out.println(ANSI_GREEN + "Ви ввели число " + percent + ANSI_RESET);
            if (books.length > 0) {
                for (int i = 0; i < books.length; i++) {
                    books[i].price = books[i].price + (double) Math.round(books[i].price / 100 * percent);
                }
            } else {
                System.out.println("Передано нульовий масив");
            }
        } else {
            System.out.println(ANSI_RED + "Введено не числове значення" + ANSI_RESET);
        }
        return books;
    }

    public Book[] getBooksByAuthor(Book[] books) {
        Book[] booksByAuthor = new Book[books.length];
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_GREEN + "Введіть автора: " + ANSI_RESET);
        String author = scanner.nextLine();
        System.out.println(ANSI_GREEN + "Ви ввели " + author + ANSI_RESET);
        for (int i = 0; i < books.length; i++) {
            if (books[i].author.equalsIgnoreCase(author)) {
                booksByAuthor[j] = books[i];
                j++;
            }
        }
        return booksByAuthor = Arrays.stream(booksByAuthor).filter(Objects::nonNull).toArray(Book[]::new);
        // тут в теорії можна ізвернутись методом створення нового масиву і додавання If not null, але багато коду і, напевно, затрат ресурсів
    }

    public Book[] getBooksByPublisher(Book[] books) {
        Book[] booksByPublisher = new Book[books.length];
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_GREEN + "Введіть видавництво: " + ANSI_RESET);
        String publisher = scanner.nextLine();
        System.out.println(ANSI_GREEN + "Ви ввели " + author + ANSI_RESET);
        for (int i = 0; i < books.length; i++) {
            if (books[i].publisher.equalsIgnoreCase(publisher)) {
                booksByPublisher[j] = books[i];
                j++;
            }
        }
        return booksByPublisher = Arrays.stream(booksByPublisher).filter(Objects::nonNull).toArray(Book[]::new);
        // тут в теорії можна ізвернутись методом створення нового масиву і додавання If not null, але багато коду і, напевно, затрат ресурсів
    }

    public Book[] getBooksByYear(Book[] books) {
        Book[] booksByYear = new Book[books.length];
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_GREEN + "Введіть рік видавництва книги: " + ANSI_RESET);
        if (scanner.hasNextInt()) {
            int yearPublished = scanner.nextInt();
            System.out.println(ANSI_GREEN + "Ви ввели рік " + yearPublished + ANSI_RESET);
           for (int i = 0; i < books.length; i++) {
                if (books[i].getYear() > yearPublished) {
                    booksByYear[j] = books[i];
                    j++;

                }
            }
        } else {
            System.out.println("Ви ввели недопустиме значення року");
        }
        return booksByYear = Arrays.stream(booksByYear).filter(Objects::nonNull).toArray(Book[]::new);
    }
}
