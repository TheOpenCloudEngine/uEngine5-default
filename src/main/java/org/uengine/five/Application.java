package org.uengine.five;

import org.metaworks.springboot.configuration.Metaworks4BaseApplication;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.sql.DataSource;

@SpringBootApplication
public class Application extends Metaworks4BaseApplication {
    protected Application(DataSource dataSource, JpaProperties properties, ObjectProvider<JtaTransactionManager> jtaTransactionManagerProvider, ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
        super(dataSource, properties, jtaTransactionManagerProvider, transactionManagerCustomizers);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}