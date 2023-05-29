package exercise.unit_test.Service;

import exercise.unit_test.Entity.User;
import exercise.unit_test.UserRepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User getUser(int id) {
        return userRepo.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        userRepo.save(user);
        return user;
    }

    public User updateUser(User user){
        userRepo.save(user);

        return user;
    }

    public void delete(int id){
        userRepo.deleteById(id);
    }

}
