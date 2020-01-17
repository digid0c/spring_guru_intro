package guru.samples.intro.repository;

import guru.samples.intro.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
