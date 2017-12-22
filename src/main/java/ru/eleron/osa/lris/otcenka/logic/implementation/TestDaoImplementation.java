package ru.eleron.osa.lris.otcenka.logic.implementation;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.eleron.osa.lris.otcenka.entity.Test;
import ru.eleron.osa.lris.otcenka.logic.dao.TestDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class TestDaoImplementation implements TestDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Test getTestById(Long id) {
        return entityManager.find(Test.class,id);
    }
}
