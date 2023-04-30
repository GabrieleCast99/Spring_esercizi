package exercise.MongoDB.Repo;

import exercise.MongoDB.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
}
