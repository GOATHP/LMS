package FinalAssignment;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberList implements Iterable<User> {


    Scanner scanner = new Scanner(System.in);
    private ArrayList<User> memberList;
    private int nextId;


    public MemberList() {
        this.memberList = new ArrayList<>();
        this.nextId = 0;

    }

    public void addMember() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("이름: ");
        String name = scanner.next();
        System.out.print("성별: ");
        String gender = scanner.next();
        
        System.out.print("생일: ");
        String bDate = scanner.next();
        LocalDate birthDay = LocalDate.parse(bDate, formatter);
        
        System.out.print("연락처: ");
        String contact = scanner.next();
        
        System.out.println("가입날짜");
        String jDate = scanner.next();
        LocalDate joinDate = LocalDate.parse(jDate, formatter);
        
        System.out.print("주소: ");
        String address = scanner.next();
        
        
        User member = new User(++nextId, name, gender, birthDay, joinDate, contact ,address);
        memberList.add(member);
    }
    

    @Override
    public Iterator<User> iterator() {
        return memberList.iterator();
    }


}
