package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Tanya", "01234");
        System.out.println(phoneBook.findByNumber("01234"));

    }
}