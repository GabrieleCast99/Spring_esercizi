package exercise.redisCache.Repository;

import exercise.redisCache.Entity.Redis.UserRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryRedis extends CrudRepository<UserRedis,Long> {
}
