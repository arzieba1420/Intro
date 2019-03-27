package pl.edu.wszib.arzieba.Intro.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.arzieba.Intro.model.Publisher;

@Repository
public interface PublisherDao extends CrudRepository<Publisher,Long> {
}
