package org.example;

import java.util.*;

public class PhoneBook {
    private Map<String, String> names = new TreeMap<>();
    private Map<String, String> numbers = new TreeMap<>();

    public int add(String name, String number) {
        if (!names.containsKey(name)) {
            names.put(name, number);
            numbers.put(number, name);
        }
        return names.size();
    }

    public String findByNumber(String number) {
        return numbers.getOrDefault(number, "not found");
    }

    public String findByName(String name) {
        return names.getOrDefault(name, "not found");
    }

    public void printAllNames() {
        names.entrySet().stream().forEach( i -> System.out.println(i.getKey() + ": " + i.getValue()));
    }
}
