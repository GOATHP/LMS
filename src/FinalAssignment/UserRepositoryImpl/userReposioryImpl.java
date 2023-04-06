package UserRepositoryImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import FinalAssignment.User;
import FinalAssignment.repository.UserRepository;

public class userReposioryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();
    private List<User> removeUsers = new ArrayList<>();
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(0);
    private Scanner scanner = new Scanner(System.in);
    
    public void createUser(User user) {
        user.setId(ID_GENERATOR.incrementAndGet());
        users.add(user);
    }

    public void restoreUser(User user) {
        Scanner scanner = new Scanner(System.in);
        User foundUser = findById(user.getId());
        int choice = scanner.nextInt();
        System.out.println("바꾸고 싶은 유저 정보가 무엇인가요? 번호를 입력해주세요");
        System.out.println("1.이름, 2.성별, 3.나이, 4.주소, 5.연락처, 6.생일, 7.가입날짜");
        if (foundUser != null) {
            switch(choice) {
                case 1:
                    foundUser.setName(user.getName());
                    break;
                case 2:
                    foundUser.setGender(user.getGender());
                    break;
                case 3:
                    foundUser.setAge(user.getAge());
                    break;
                case 4:
                    foundUser.setAddress(user.getAddress());
                    break;
                case 5:
                    foundUser.setContact(user.getContact());
                    break;
                case 6:
                    foundUser.setBirthDate(user.getBirthDate());
                    break;
                case 7:
                    foundUser.setJoinDate(user.getJoinDate());
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


    @Override
    public void saveDeletedUser(User user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User restoreDeletedUser() {
        // TODO Auto-generated method stub
        return null;
    }



}
