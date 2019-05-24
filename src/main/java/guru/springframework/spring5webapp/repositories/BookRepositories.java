package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class BookRepositories implements CrudRepository<Author, Long> {
    @Override
    public <S extends Author> S save(S s) {
        return null;
    }

    @Override
    public <S extends Author> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Author> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Author> findAll() {
        return null;
    }

    @Override
    public Iterable<Author> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Author author) {

    }

    @Override
    public void deleteAll(Iterable<? extends Author> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
