package exercise.Spring.Repositories2.Repository;

import exercise.Spring.Repositories2.Entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository for ProgrammingLanguage table"))
public interface PLRepository extends JpaRepository<ProgrammingLanguage,Integer> {
}
