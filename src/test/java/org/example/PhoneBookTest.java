package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {

    private static PhoneBook phoneBook;

    @BeforeAll
    public static void init() {
        phoneBook = new PhoneBook();
        phoneBook.add("Tanya", "0123");
        phoneBook.add("Petya", "01234");
        phoneBook.add("Olya", "012345");
    }

    @Test
    public void testAdd() {
        int count = phoneBook.add("name1", "012345");
        int result = phoneBook.add("name2", "012346");
        int expected = count + 1;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testAddReplays() {
        int count = phoneBook.add("name1", "012345");
        int result = phoneBook.add("name1", "012345");
        int expected = count;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumber() {
        String expected = "Tanya";
        String result = phoneBook.findByNumber("0123");
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFindByNumberNotFound() {
        String expected = "not found";
        String result = phoneBook.findByNumber("0000");
        Assertions.assertEquals(expected, result);
    }
}
