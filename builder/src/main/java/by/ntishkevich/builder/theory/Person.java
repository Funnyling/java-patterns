package by.ntishkevich.builder.theory;

/**
 * by.ntishkevich.builder.theory.Person, the class with many parameters.
 *
 * @author ntishkevich
 * @version 21.02.2016
 */
public class Person {
    private EyeColor eyesColor;
    private String name;
    private HairColor hairColor;
    private HairType hairType;
    private Gender gender;

    public Person(PersonBuilder personBuilder) {
        this.eyesColor = personBuilder.eyesColor;
        this.name = personBuilder.name;
        this.hairColor = personBuilder.hairColor;
        this.hairType = personBuilder.hairType;
        this.gender = personBuilder.gender;
    }

    public EyeColor getEyesColor() {
        return eyesColor;
    }

    public String getName() {
        return name;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public HairType getHairType() {
        return hairType;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("This is a" );
        sb.append(gender);
        sb.append(" person named: ");
        sb.append(name);
        if (hairColor != null || hairType != null) {
            sb.append(" with ");
            if (hairColor != null) {
                sb.append(hairColor);
                sb.append(" ");
            }
            if (hairType != null) {
                sb.append(hairType);
                sb.append(" ");
            }
            sb.append(hairType != HairType.BALD ? "hair" : "head");
        }

        if (eyesColor != null) {
            sb.append(" and eyes color ");
            sb.append(eyesColor);
        }
        sb.append(".");
        return sb.toString();
    }

    /**
     *
     * The builder class.
     *
     */
    public static class PersonBuilder {
        private final String name;
        private final Gender gender;
        private HairType hairType;
        private HairColor hairColor;
        private EyeColor eyesColor;

        public PersonBuilder(Gender gender, String name) {
            if (gender == null || name == null) {
                throw new IllegalArgumentException(
                        "Gender and name can not be null!");
            }
            this.gender = gender;
            this.name = name;
        }

        public PersonBuilder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public PersonBuilder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public PersonBuilder withEyesColor(EyeColor eyesColor) {
            this.eyesColor = eyesColor;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}


