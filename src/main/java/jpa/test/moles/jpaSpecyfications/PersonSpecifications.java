package jpa.test.moles.jpaSpecyfications;

import jpa.test.moles.entities.Person;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


/**
 * Created by moles on 18.02.2018.
 */
public class PersonSpecifications {
    /**
     * search by name
     * @param name nama
     * @return search spec
     */
    public static Specification<Person> findByName(String name) {
        return new Specification<Person>() {
            @Override
            public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("name"),"%"+name+"%");
            }
        };
    }
}
