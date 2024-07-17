import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person personaJuan = new Person();
        personaJuan.setName("Juan");
        personaJuan.setBirtDate(generateBirthdate());
        personaJuan.greet();

        Person personaMarian = new Person();
        personaMarian.setName("Marian");
        personaMarian.setBirtDate(generateBirthdate());
        personaMarian.greet();

        List<Person> personas = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Person persona = new Person();
            persona.setName("Persona " + (i + 1));
            persona.setBirtDate(generateBirthdate());
            personas.add(persona);
            persona.greet();
        }
    }

    private static LocalDate generateBirthdate() {
        int startYear = 1970;
        int endYear = 2005;
        int year = (int) (Math.random() * (endYear - startYear + 1)) + startYear;
        int month = (int) (Math.random() * 12) + 1;
        int day = (int) (Math.random() * 28) + 1;
        return LocalDate.of(year, month, day);
    }
}