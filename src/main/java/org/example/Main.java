package org.example;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Tanya", "00-11-22");
        phoneBook.add("Anna", "22-66-44");
        phoneBook.add("Petya", "88-11-44");
        phoneBook.printAllNames();
    }
}