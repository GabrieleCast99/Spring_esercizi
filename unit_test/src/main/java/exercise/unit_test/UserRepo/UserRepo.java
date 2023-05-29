package exercise.unit_test.UserRepo;

import exercise.unit_test.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{
    Optional<User> findById(Integer id);

    void deleteById(Integer id);
}
