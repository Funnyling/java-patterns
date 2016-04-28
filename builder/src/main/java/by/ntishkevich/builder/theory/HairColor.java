package by.ntishkevich.builder.theory;

/**
 * by.ntishkevich.builder.theory.HairColor enumeration
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public enum HairColor {
    WHITE, BLOND, RED, BROWN, BLACK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
