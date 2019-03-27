package pl.edu.wszib.arzieba.Intro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.arzieba.Intro.model.Book;

@Repository
public interface BookDao extends CrudRepository<Book,Long> {
}
