package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private String name;
    private String number;
    private Map<String, String> contacts = new HashMap<>();

    public int add(String name, String number) {
        contacts.putIfAbsent(name, number);
        return contacts.size();
    }

    public String findByNumber(String number) {
        return null;
    }

    public String findByName(String name) {
        return null;
    }
}
