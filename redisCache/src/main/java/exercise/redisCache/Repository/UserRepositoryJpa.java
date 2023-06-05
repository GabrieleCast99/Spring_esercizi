package exercise.redisCache.Repository;

import exercise.redisCache.Entity.Jpa.UserJPA;
import exercise.redisCache.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJpa extends JpaRepository<UserJPA,Long> {
}
