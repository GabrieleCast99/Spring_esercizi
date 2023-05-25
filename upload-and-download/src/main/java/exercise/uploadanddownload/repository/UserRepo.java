package exercise.uploadanddownload.repository;

import exercise.uploadanddownload.entities.UserFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserFile,Integer> {

}
