package exercise.redisCache.Entity.Redis;

import exercise.redisCache.Entity.User;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import jakarta.persistence.*;



@RedisHash(value = "user", timeToLive = 60)
@Data
public class UserRedis implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String firstName;
    private String lastName;
    private String profilePicture;
    private String email;
    private String passwordEncrypted;

    private String domicileAddress;
    private String domicileCity;
    private String domicileNumber;
    private String domicileState;

    private String fiscalCode;
}