package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException("No element founded");
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"read", "write"}, "watch");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}