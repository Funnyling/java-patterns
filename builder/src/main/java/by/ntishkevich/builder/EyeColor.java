package by.ntishkevich.builder;

/**
 * by.ntishkevich.builder.EyeColor enumeration
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public enum EyeColor {
    BLUE, GREEN, BROWN;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
