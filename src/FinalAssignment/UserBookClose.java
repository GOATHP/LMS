package FinalAssignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserBookClose {

    public void UserCsvOpen() {
    String fileName = "user.csv";
    File file = new File(fileName);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    try {
        Scanner fileScanner = new Scanner(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
    }
    
    
    public void BookCsvOpen() {
    String fileName = "book.csv";
    File file = new File(fileName);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    try {
        Scanner fileScanner = new Scanner(file);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
    }
}

    
