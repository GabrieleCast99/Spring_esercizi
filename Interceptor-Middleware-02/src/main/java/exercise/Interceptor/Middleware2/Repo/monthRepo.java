package exercise.Interceptor.Middleware2.Repo;

import exercise.Interceptor.Middleware2.Entity.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface monthRepo extends JpaRepository<Month, Integer> {
}
