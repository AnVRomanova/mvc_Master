package web.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserRepositoryImpl implements  UserRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    @Override
    public List<User> getAllUsers() {

        String jpql = "from User";
        TypedQuery<User> query = entityManager.createQuery(jpql, User.class);
        return query.getResultList();
    }
    @Transactional
    @Override
    public void addUser(User user) {
        entityManager.persist(user);

    }

    @Override
    public User readUser(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void edit(User user) {

        entityManager.merge(user);
    }
}
