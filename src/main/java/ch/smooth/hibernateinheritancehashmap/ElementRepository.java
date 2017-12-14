package ch.smooth.hibernateinheritancehashmap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
@RepositoryRestResource
public interface ElementRepository extends JpaRepository<Element, Long> {

    Optional<Element> findByText(@Param("text") String text);

}
