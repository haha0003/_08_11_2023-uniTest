public class Person {
    private String name; // Must not be null or empty string
    private int yearOfBirth; // Must not be greater than this year
    private char gender; // Must be either 'M' or 'F' (non-case sensitive)


    public Person(String name, int yearOfBirth, char gender){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public char getGender() {
        return gender;
    }

}
