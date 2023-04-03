import java.math.BigDecimal;
import java.util.Objects;

public class Czeslaw {
    public final String name;
    public final String surname;
    public final BigDecimal salary;

    public Czeslaw(String name, String surname, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Czeslaw)) return false;
        Czeslaw czeslaw = (Czeslaw) o;
        return Objects.equals(name, czeslaw.name) && Objects.equals(surname, czeslaw.surname) && Objects.equals(salary, czeslaw.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, salary);
    }
}
