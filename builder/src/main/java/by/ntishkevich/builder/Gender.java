package by.ntishkevich.builder;

/**
 * by.ntishkevich.builder.Gender enumeration
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public enum Gender {
    MALE, FEMALE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
