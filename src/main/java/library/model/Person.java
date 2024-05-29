package library.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Person {
    private int person_id;
    @NotEmpty(message = "Name should not be empty") //запрет пустого имени
    @Size(min=2, max=50, message = "Name should be between 2 and 50 characters") //диапазон символов в имени
    private String name;
    @Min(value = 1500,message = "Year should be greater than 1500") // минимальное значение 0
    private int year;

    public Person(int person_id, String name, int year) {
        this.person_id = person_id;
        this.name = name;
        this.year = year;
    }
public Person(){

}
    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
