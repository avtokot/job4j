package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] val, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < val.length; i++) {
            if (val[i].equals(key)) {
                result = 1;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] str = new String[]{"Winter", "Cold", "Winner"};
        try {
            indexOf(str, "Cold");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static class ElementNotFoundException extends Exception {
        public ElementNotFoundException(String message) {
            super(message);
        }
    }
}
