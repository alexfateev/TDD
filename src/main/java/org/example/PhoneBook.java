package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> names = new HashMap<>();
    private Map<String, String> numbers = new HashMap<>();

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
        return null;
    }
}
