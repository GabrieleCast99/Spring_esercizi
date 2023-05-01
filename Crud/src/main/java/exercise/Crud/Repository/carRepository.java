package exercise.Crud.Repository;

import exercise.Crud.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface carRepository extends JpaRepository<Car, Integer> {

}
