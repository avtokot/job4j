package ru.job4j.array;

/**
 * ArrayDefinition.
 */
public class ArrayDefinition {
    /**
     * @param args - someNumbers
     */
    public final void main(final String[] args) {
        final int ageSomeNumber = 10;
        short[] ages = new short[ageSomeNumber];
        System.out.println("Размер массива " + ages.length);
        final int surnameSomeNumber = 100500;
        String[] surname = new String[surnameSomeNumber];
        System.out.println("Размер массива " + surname.length);
        final int pricesSomeNumber = 40;
        float[] prices = new float[pricesSomeNumber];
        System.out.println("Размер массива " + prices.length);
        final int namesSome = 3;
        String[] names = new String[namesSome];
        names[0] = "Kot";
        names[1] = "Glover";
        names[2] = "Gillan";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
