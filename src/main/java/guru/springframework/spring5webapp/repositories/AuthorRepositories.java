package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Spring auto-generates the methods
public interface AuthorRepositories extends CrudRepository<Author, Long> {
}
