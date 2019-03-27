package pl.edu.wszib.arzieba.Intro.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.edu.wszib.arzieba.Intro.dao.AuthorDao;
import pl.edu.wszib.arzieba.Intro.dao.BookDao;
import pl.edu.wszib.arzieba.Intro.dao.PublisherDao;
import pl.edu.wszib.arzieba.Intro.model.Author;
import pl.edu.wszib.arzieba.Intro.model.Book;
import pl.edu.wszib.arzieba.Intro.model.Publisher;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private AuthorDao authorDao;
    @Autowired
    private PublisherDao publisherDao;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    public void initData(){

        //Publisher
        Publisher publisher = new Publisher();
        publisher.setName("TestName");
        publisher.setAddress("ul.XXX, Cr");
        publisherDao.save(publisher);

        //1st Author
        Author john = new Author("John","Snow");
        Book testBook1 = new Book("TestBook1","1234",publisher);
        john.getBooks().add(testBook1);
        testBook1.getAuthors().add(john);

        authorDao.save(john);
        bookDao.save(testBook1);

        //2nd Author
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorDao.save(rod);
        bookDao.save(noEJB);


    }

}
