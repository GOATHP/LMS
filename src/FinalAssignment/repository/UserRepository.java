package FinalAssignment.repository;

import java.util.List;
import FinalAssignment.User;

public interface UserRepository {
    // CRUD
    void addUser();

    void restoreUser();
        
    void removeUser();
    
    List<User> findAll();

    User findById(int id);

    User findByName(String name);
   

    void updateUser();
}

