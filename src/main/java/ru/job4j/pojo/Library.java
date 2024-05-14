package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 360);
        Book book2 = new Book("Three comrades", 250);
        Book book3 = new Book("Red hat", 45);
        Book book4 = new Book("Pride and prejudice", 500);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getQuantityOfPages() + " pages");
        }
        System.out.println("==================");
        System.out.println("Replace Pride and prejudice to Clean code");
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getQuantityOfPages() + " pages");

        }
        System.out.println("==================");
        System.out.println("Show only Clean code");
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getQuantityOfPages() + " pages");
            }
        }
    }
}