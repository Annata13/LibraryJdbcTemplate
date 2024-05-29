package library.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Book {
    private int book_id;
    @NotEmpty(message = "Name should not be empty") //запрет пустого имени
    @Size(min=2, max=50, message = "Name should be between 2 and 50 characters") //диапазон символов в имени
    private String name;
    @Min(value = 1000,message = "Year should be greater than 1000") // минимальное значение 0
    private int year;
    @NotEmpty(message = "Author should not be empty") //запрет пустого имени
    private String author;

    public Book(int book_id, String name, int year, String author) {
        this.book_id = book_id;
        this.name = name;
        this.year = year;
        this.author = author;
    }
    public Book(){}

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
