package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Library Library = new Library();

        Library.takeBook(LocalDate.of(2021, 10, 11), "1984");
        Library.takeBook(LocalDate.of(2021, 10, 12), "Animal Farm: A Fairy Story");
        Library.takeBook(LocalDate.of(2021, 11, 1), "The Picture of Dorian Gray");
        Library.takeBook(LocalDate.of(2021, 11, 02), "The Call of the Wild");
        Library.takeBook(LocalDate.of(2021, 11, 05), "Martin Eden");

        System.out.println(Library);
        System.out.println("Taken book for dates: ");

        Library.searchBookbyDate(LocalDate.of(2021, 10, 12));
        Library.searchBookbyDate(LocalDate.of(2021, 10, 13));
        System.out.println("All books taken in Library:");
        System.out.println(Library.bookList());
        System.out.println("Range of dates:");
        System.out.println(Library.dateRange());

    }
}







