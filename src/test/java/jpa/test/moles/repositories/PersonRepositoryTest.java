package jpa.test.moles.repositories;

import jpa.test.moles.entities.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by moles on 2018-02-16.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class PersonRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PersonRepository personRepository;

    @Before
    public void init(){
        Person p=new Person();
        entityManager.persist(p);
    }
    @Test
    public void workTest(){
        List<Person> all = (List<Person>) personRepository.findAll();
    }
}