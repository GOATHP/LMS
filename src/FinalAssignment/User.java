package FinalAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class User {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    
    private int id;
    private String name;
    private String gender;
    private int age;
    private String address;
    private String contact;
    private String birthDate;
    private String joinDate;
    private List<Book> borrowedBooks;
    
    public User(String name) {
        this(name, null, 0, null, null, null, null);
        
    }

    public User(String name, String gender, int age, String address, String contact,
            String birthDay, String joinDate) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.contact = contact;
        this.birthDate = birthDay;
        this.joinDate = joinDate;
        this.borrowedBooks = new ArrayList<>();
        
        
    }

    public static AtomicInteger getID_GENERATOR() {
        return ID_GENERATOR;
    }

    public static void setID_GENERATOR(AtomicInteger iD_GENERATOR) {
        ID_GENERATOR = iD_GENERATOR;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public String getAddress() {
        return address;
    }



    public void setAddress(String address) {
        this.address = address;
    }



    public String getContact() {
        return contact;
    }



    public void setContact(String contact) {
        this.contact = contact;
    }



    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate2) {
        this.joinDate = joinDate2;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age
                + ", address=" + address + ", number=" + contact + ", birthDate=" + birthDate
                + ", joinDate=" + joinDate + "]";
    }

}
