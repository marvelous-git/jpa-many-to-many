package zw.co.econet.jpamanytomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.econet.jpamanytomany.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
