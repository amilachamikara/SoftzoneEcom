package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

/**
 * Created by Amila on 1/12/16.
 */
@Configuration
@EnableTransactionManagement
public class DBConfig {
    @Bean
    public LocalSessionFactoryBean sessionFactory(){
        LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
        lsfb.setDataSource(dataSource());
        lsfb.setPackagesToScan("core.domain");
        Properties hibernateProperties = new Properties();
        hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
        hibernateProperties.setProperty("show_sql","true");
        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
        lsfb.setHibernateProperties(hibernateProperties);
        return lsfb;
    }

    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/softzone-ecom");
        ds.setUsername("root");
        ds.setPassword("123");
        return ds;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        HibernateTransactionManager htm = new HibernateTransactionManager(sessionFactory().getObject());
        return htm;
    }
}
