package FinalAssignment;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import Presentation.UserController;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();
        userController.printMenu();
        
        
    }
}
        ////        Member member = new Member("박태현", "1996-05-03", "010-3319-0457", "경기도 월피동");
////        System.out.println(member.getAge());
//        Scanner scanner = new Scanner(System.in);
////        ArrayList<Member> memberList = new ArrayList<>();
//        MemberList members = new MemberList();
//        
//        int choice;
//        String fileName = "member.csv";
//        File file = new File(fileName);
//        
//        
//        
//        if (!file.exists()) {
//        try {
//            FileWriter fileWriter = new FileWriter(fileName, true);
//            fileWriter.write("ID,성별,이름,나이,생년월일,가입일자,연락처,주소\n"); // 열 이름 추가
//            fileWriter.close();
//        } catch (IOException e) {
//            System.out.println("파일 쓰기 오류가 발생하였습니다.");
//            }
//        }
//        
//        // 파일에서 회원 정보를 읽어와서 MemberList에 추가
////        try {
////            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
////            Scanner fileScanner = new Scanner(file);
////            fileScanner.nextLine(); // 첫 줄(열 이름)은 읽지 않음
////            while (fileScanner.hasNextLine()) {
////                String[] line = fileScanner.nextLine().split(",");
////                int id = Integer.parseInt(line[0]);
////                String name = line[1];
////                byte gender = (byte) Integer.parseInt(line[2]);
////                int age = Integer.parseInt(line[3]);
////                
////                LocalDate birthDay = LocalDate.parse(line[4],formatter);
////                
////                LocalDate joinDate = LocalDate.parse(line[5],formatter);
////                String contact = line[6];
////                String address = line[7];
////                
////                Member member = new Member(id, name, gender, birthDay,joinDate, contact, address);
////                memberList.add(member);
////            }
////            fileScanner.close();
////        } catch (IOException e) {
////            System.out.println("파일 읽기 오류가 발생하였습니다.");
////        }
//        while (true) {
//            System.out.println("1. 회원관리    2. 도서관리    3. 종료");
//            choice = scanner.nextInt();
//            switch (choice) {
//                case 1:
//                    while (true) {
//                        ArrayList<User> memberList = new ArrayList<>();
//                        if (file.length() > 70) {
//                            try {
//                                
//                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//                                Scanner fileScanner = new Scanner(file);
//                                fileScanner.nextLine(); // 첫 줄(열 이름)은 읽지 않음
//                                while (fileScanner.hasNextLine()) {
//                                    String[] line = fileScanner.nextLine().split(",");
//                                    int id = Integer.parseInt(line[0]);
//                                    String name = line[1];
//                                    String gender = line[2];
//                                    int age = Integer.parseInt(line[3]);
//                                    
//                                    LocalDate birthDay = LocalDate.parse(line[4],formatter);
//                                    
//                                    LocalDate joinDate = LocalDate.parse(line[5],formatter);
//                                    String contact = line[6];
//                                    String address = line[7];
//                                    
//                                    User member = new User(id, name, gender, birthDay,joinDate, contact, address);
//                                    memberList.add(member);
//                                    
//                                }
//                                fileScanner.close();
//                            } catch (IOException e) {
//                                System.out.println("파일 읽기 오류가 발생하였습니다.");
//                            }
//                            
//                            }
//                        System.out.println("0. 뒤로    1. 회원조회    2. 회원등록    3. 회원수정    4. 회원삭제    5. 삭제취소");
//
//                        choice = scanner.nextInt();
//                        switch (choice) {
//                            case 0:
//                                break;
//                            case 1:
//                                // 회원조회 기능 구현
//                                for (User member : memberList) {
//                                    System.out.println(member);
//                                }
//                                break;
//                            case 2:
//                                members.addMember();
//                                for (User member : members) {
//                                    try {
//                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName, true), "UTF-8");
//                                        outputStreamWriter.write(member.getId() + "," + member.getName()  + "," + member.getGender() + "," + member.getAge() + "," + member.getBirthDay() + ","+ member.getJoinDate() + "," + member.getContact() + "," + member.getAddress() + "\n");
//                                        outputStreamWriter.close();
//                                        System.out.println("회원 등록이 완료되었습니다.");
//                                    } catch (IOException e) {
//                                        System.out.println("잘못된 입력입니다.");
//                                  }
//                                }
//                                // 회원등록 기능 구현
//                                break;
//                            case 3:
//                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//                                System.out.println("바꿀 회원의 ID를 입력하세요.");
//                                choice = scanner.nextInt();
//                                
//                                for (User member : memberList) {
//
//                                    if (member.getId() == choice) {
//                                        System.out.println("무엇을 수정하실건가요 입력해주세요. (1. 이름, 2. 성별, 3. 생일, 4. 연락처, 5. 가입날짜, 6. 주소)");
//                                        
//                                        choice = scanner.nextInt();
//                                        switch(choice) {
//                                            case 1:
//                                                System.out.println("바꾸실 이름을 입력해주세요.");
//                                                member.setName(scanner.next());
//                                                break;
//                                            case 2:
//                                                System.out.println("바꾸실 성별을 입력해주세요.");
//                                                member.setGender(scanner.next());
//                                                break;
//                                            case 3:
//                                                System.out.print("바꾸실 생일을 입력해주세요.: ");
//                                                String bDate = scanner.next();
//                                                LocalDate birthDay = LocalDate.parse(bDate, formatter);
//                                                member.setBirthDay(birthDay);
//                                                break;
//                                            case 4:
//                                                System.out.print("바꾸실 연락처룰 입력해주세요.: ");
//                                                String contact = scanner.next();
//                                                member.setContact(contact);
//                                                break;
//                                                
//                                            case 5:
//                                                System.out.println("바꾸실 가입날짜를 입력해주세요.:");
//                                                String jDate = scanner.next();
//                                                LocalDate joinDate = LocalDate.parse(jDate, formatter);
//                                                member.setJoinDate(joinDate);
//                                                break;
//                                            case 6:
//                                                System.out.print("바꾸실 주소를 입력해주세요.: ");
//                                                String address = scanner.next();
//                                                member.setAddress(address);
//                                                break;
//                                            
//                                        }
//                                        
//                                    }try {
//                                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName, true), "UTF-8");
//                                        outputStreamWriter.write(member.getId() + "," + member.getName()  + "," + member.getGender() + "," + member.getAge() + "," + member.getBirthDay() + ","+ member.getJoinDate() + "," + member.getContact() + "," + member.getAddress() + "\n");
//                                        outputStreamWriter.close();
//                                        System.out.println("회원 수정이 완료되었습니다.");
//                                    } catch (IOException e) {
//                                        System.out.println("잘못된 입력입니다.");
//                                  }
//                                
//                                }
//                                
//                                
//                                break;
//                                // 회원수정 기능 구현
//                            case 4:
//                                // 회원삭제 기능 구현
//                                break;
//                            case 5:
//                                // 삭제취소 기능 구현
//                                break;
//                            default:
//                                System.out.println("잘못된 입력입니다.");
//                                break;
//                        }
//
//                        if (choice == 0) {
//                            break;
//                        }
//                    }
//                    break;
//                case 2:
//                    // 도서관리 기능 구현
//                    break;
//                case 3:
//                    System.out.println("프로그램을 종료합니다.");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다.");
//                    break;
//            }
//        }
//    }
//}
