package pl.edu.wszib.arzieba.Intro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.arzieba.Intro.model.Author;

@Repository
public interface AuthorDao extends CrudRepository<Author,Long> {
}
