package core.repository;

import core.domain.User;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Amila on 1/15/16.
 */


@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public User getById(int id) {
        return (User)sessionFactory.getCurrentSession().get(User.class, id);
    }

    public List<User> list() {
        return sessionFactory.getCurrentSession().createCriteria(User.class).list();
    }

    public void delete(int id) {
        sessionFactory.getCurrentSession().delete(getById(id));
    }

    public void save(User user) {
        sessionFactory.getCurrentSession().saveOrUpdate(user);
    }

    public User getByUsername(String username){
        return (User)sessionFactory.getCurrentSession().createCriteria(User.class).add(Restrictions.eq("username", username)).uniqueResult();
    }

    @Override
    public void delete(User obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }
}
