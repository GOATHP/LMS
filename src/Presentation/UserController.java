package Presentation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import FinalAssignment.User;
import UserRepositoryImpl.UserReposioryImpl;

public class UserController {
    ArrayList<User> memberList = new ArrayList<>();
    UserReposioryImpl userRepositoryImpl = new UserReposioryImpl();
    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    int choice;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public void printMenu() {
            while (!isExit) {
            System.out.println("1. 유저등록, 2. 유저목록, 3. 유저수정, 4. 유저삭제, 5. 삭제취소 0. 뒤로");
            int target = scanner.nextInt();
            if (target == 1) {
                userRepositoryImpl.addUser();
            } else if (target == 2) {
                System.out.println(userRepositoryImpl.findAll());
            } else if (target == 0) {
                isExit = true;
            } else if (target == 3) {
                userRepositoryImpl.updateUser();
            } else if (target == 4) {
                userRepositoryImpl.removeUser();
            } else if (target == 5) {
                userRepositoryImpl.restoreUser();
            }
        }
    }
    public void exit() {
        // 이전 화면으로 돌아가기
    }
}

