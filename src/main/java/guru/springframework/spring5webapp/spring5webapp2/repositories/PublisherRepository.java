package guru.springframework.spring5webapp.spring5webapp2.repositories;

import guru.springframework.spring5webapp.spring5webapp2.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
