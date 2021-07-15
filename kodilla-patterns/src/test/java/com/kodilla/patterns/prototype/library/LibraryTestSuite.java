package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks(){

        //given
        //create some books
        Book book1 = new Book("Bible", "God", LocalDate.MIN);
        Book book2 = new Book("Miasto z mgły", "Carlos Ruiz Zafon", LocalDate.of(2021, 2, 2));
        Book book3 = new Book("Pieśń o Achillesie", "Madeline Miller", LocalDate.of(2021, 06, 16));
        Book book4 = new Book("The Culture Map", "Erin Meyer", LocalDate.of(2016, 01, 05));

        //creating library and add books
        Library library = new Library("Bibloteka publiczna nr 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        //making a shallow copy of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Bibloteka publiczna nr 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Bibloteka publiczna nr 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //when
        library.getBooks().remove(book1);

        //then
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());


    }
}
