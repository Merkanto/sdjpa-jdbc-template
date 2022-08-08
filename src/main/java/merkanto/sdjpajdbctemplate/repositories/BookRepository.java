package merkanto.sdjpajdbctemplate.repositories;

import merkanto.sdjpajdbctemplate.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
