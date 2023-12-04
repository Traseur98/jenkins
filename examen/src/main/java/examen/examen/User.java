package examen.examen;

import java.time.LocalDate;

public class User extends Person{
    private int id;
    private LocalDate admissionDate;
    
    public User(String name, String surname, String adress, Integer age, int id, LocalDate admissionDate) {
        super(name, surname, adress, age);
        this.id = id;
        this.admissionDate = admissionDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }
}
