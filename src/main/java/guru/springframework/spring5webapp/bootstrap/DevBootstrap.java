package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/16/17.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository pubRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository,PublisherRepository pubRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.pubRepository = pubRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        //Eric
        {
            Author eric = new Author("Eric", "Evans");
            Publisher pub = new Publisher("myPub", "myAddr");

            Book ddd = new Book("Domain Driven Design", "1234", pub);
            eric.getBooks().add(ddd);
            ddd.getAuthors().add(eric);

            authorRepository.save(eric);
            pubRepository.save(pub);
            bookRepository.save(ddd);
        }

        //Rod
        {
            Author rod = new Author("Rod", "Johnson");
            Publisher pub = new Publisher("myPub", "myAddr");
            Book noEJB = new Book("J2EE Development without EJB", "23444", pub);
            rod.getBooks().add(noEJB);
            noEJB.getAuthors().add(rod);

            authorRepository.save(rod);
            pubRepository.save(pub);
            bookRepository.save(noEJB);
        }
    }
}
