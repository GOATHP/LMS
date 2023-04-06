package Presentation;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import FinalAssignment.User;
import UserRepositoryImpl.userReposioryImpl;

public class UserController {
    ArrayList<User> memberList = new ArrayList<>();
    userReposioryImpl userRepositoryImpl = new userReposioryImpl();
    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    int choice;
    
    public void printMenu() {
            while (!isExit) {
            System.out.println("1. 유저등록, 2. 유저목록, 3. 유저수정, 4. 유저삭제, 5. 삭제취소 0. 뒤로");
            int target = scanner.nextInt();
            if (target == 1) {
                
                String name = scanner.next();
                String gender = scanner.next();
                int age = scanner.nextInt();
                String address = scanner.next();
                String contact = scanner.next();
                String birthDate = scanner.next();
                String joinDate = scanner.next();
                Date birth = Date.parse(birthDate);
                Date join = Date.parse(joinDate);
                
                User user = new User(name, gender, age, address, contact, birth, join);
                userRepositoryImpl.createUser(user);
            
            } else if (target == 2) {
                userRepositoryImpl.printUserList();
            } else if (target == 0) {
                isExit = true;
            } else if (target == 3) {
                userRepositoryImpl.restoreUser();
            } else if (target == 4) {
                userRepositoryImpl.removeUser();
            } else if (target == 5) {
                restoreUser();
            }
        }
    }
        
    
    
    public void exit() {
        // 이전 화면으로 돌아가기
    }
}

