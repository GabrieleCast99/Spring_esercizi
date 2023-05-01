package exercise.Spring.Repositories1.Repository;

import exercise.Spring.Repositories1.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Integer> {
}
