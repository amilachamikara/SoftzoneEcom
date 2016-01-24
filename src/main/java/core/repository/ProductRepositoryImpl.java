package core.repository;

import core.domain.Product;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Amila on 1/20/16.
 */
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product getById(int id) {
        return (Product) sessionFactory.getCurrentSession().get(Product.class, id);
    }

    @Override
    public List<Product> list() {
        return sessionFactory.getCurrentSession().createCriteria(Product.class).addOrder(Order.asc("id")).list();
    }

    @Override
    public void delete(int id) {
        sessionFactory.getCurrentSession().delete(getById(id));
    }

    @Override
    public void save(Product obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }

    @Override
    public void delete(Product product) {
        sessionFactory.getCurrentSession().delete(product);
    }
}
