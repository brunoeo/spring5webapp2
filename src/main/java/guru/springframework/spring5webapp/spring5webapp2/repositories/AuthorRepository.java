package guru.springframework.spring5webapp.spring5webapp2.repositories;


import guru.springframework.spring5webapp.spring5webapp2.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
