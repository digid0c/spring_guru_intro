package guru.samples.intro.repository;

import guru.samples.intro.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
