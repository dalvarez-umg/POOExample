import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birtDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public LocalDate getBirtDate() {
        return this.birtDate;
    }

    private int calculateAge() {
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(this.birtDate, actualDate);
        return period.getYears();
    }

    public void greet() {
        System.out.println("Hola, mi nombre es " + this.name + " y tengo " + calculateAge() + " años.");
    }
}
