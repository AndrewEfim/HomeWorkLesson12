package by.itacademy.task12.domain;

import java.time.LocalDate;

public class Patient {

    private String name;
    private String surname;
    private LocalDate birth;
    private boolean health;

    public Patient() {
    }

    public Patient(String name, String surname, LocalDate birth, boolean health) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass( ) != o.getClass( )) return false;

        Patient patient = (Patient) o;

        if (!name.equals(patient.name)) return false;
        if (!surname.equals(patient.surname)) return false;
        return birth.equals(patient.birth);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode( );
        result = 31 * result + surname.hashCode( );
        result = 31 * result + birth.hashCode( );
        return result;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public boolean isHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + birth +
                ", health=" + health +
                '}';
    }
}

