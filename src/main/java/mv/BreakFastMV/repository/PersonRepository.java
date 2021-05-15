package mv.BreakFastMV.repository;

import mv.BreakFastMV.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
