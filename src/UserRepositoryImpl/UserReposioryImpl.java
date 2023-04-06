package UserRepositoryImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import FinalAssignment.User;
import FinalAssignment.repository.UserRepository;

public class UserReposioryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();
    private List<User> removeUsers = new ArrayList<>();
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    private Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public void addUser() {
        String name = scanner.next();
        String gender = scanner.next();
        int age = scanner.nextInt();
        String address = scanner.next();
        String contact = scanner.next();
        String birthDate = scanner.next();
        String joinDate = scanner.next();
        User user = new User(name, gender, age, address, contact, birthDate, joinDate);
    }
    
    public void updateUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 번 id 복구?");
        int target = scanner.nextInt();
        User foundUser = findById(target);
        int choice = scanner.nextInt();
        System.out.println("바꾸고 싶은 유저 정보가 무엇인가요? 번호를 입력해주세요");
        System.out.println("1.이름, 2.성별, 3.나이, 4.주소, 5.연락처, 6.생일, 7.가입날짜");
        if (foundUser != null) {
            switch(choice) {
                case 1:
                    foundUser.setName(scanner.next());
                    break;
                case 2:
                    foundUser.setGender(scanner.next());
                    break;
                case 3:
                    foundUser.setAge(scanner.nextInt());
                    break;
                case 4:
                    foundUser.setAddress(scanner.next());
                    break;
                case 5:
                    foundUser.setContact(scanner.next());
                    break;
                case 6:
                    
                    foundUser.setBirthDate(scanner.next());
                    break;
                case 7:
                    foundUser.setJoinDate(scanner.next());
                    break;
                default:
                    throw new IllegalArgumentException("범위 밖의 숫자입니다. 1-7 사이의 값을 입력해주세요.");
            }
        }   
    }
    
    public void removeUser() {
        System.out.println("몇 번 id 삭제?");
        int target = scanner.nextInt();
        
        removeUsers.add(findById(target));
        
        users.remove(findById(target));
    }

    public List<User> findAll() {
        return users;
    }

    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
    
    public User findByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
        
    public void restoreUser() {
        System.out.println("몇 번 id 복구?");
        int target = scanner.nextInt();
        for (User user : removeUsers) {
            if (user.getId() == target) {
                users.add(user);
                removeUsers.remove(findById(target));
            }
        }
        
        
    }




}
