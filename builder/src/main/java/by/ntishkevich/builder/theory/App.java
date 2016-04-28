package by.ntishkevich.builder.theory;

/**
 * * This is the Builder pattern variation as described by Joshua Bloch in
 * Effective Java 2nd Edition.
 * <p>
 * We want to build {@link Person} objects, but its construction is complex because of the
 * many parameters needed. To aid the user we introduce {@link Person.PersonBuilder} class.
 * {@link Person.PersonBuilder} takes the minimum parameters to build {@link Person} object in its
 * constructor. After that additional configuration for the {@link Person} object can be
 * done using the fluent {@link Person.PersonBuilder} interface. When configuration is ready the
 * build method is called to receive the final {@link Person} object.
 * @author ntishkevich
 * @version 21.02.2016
 */
public class App {
    public static void main(String[] args) {
        Person jane = new Person.PersonBuilder(Gender.FEMALE, "Jane")
                .withHairColor(HairColor.BLACK).withEyesColor(EyeColor.GREEN)
                .build();
        System.out.println(jane);

        Person john = new Person.PersonBuilder(Gender.MALE, "John")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_STRAIGHT).withEyesColor(EyeColor.BLUE)
                .build();
        System.out.println(john);

        Person andrew = new Person.PersonBuilder(Gender.MALE, "Andrew")
                .withHairType(HairType.BALD).build();
        System.out.println(andrew);
    }
}
