package br.com.rnantes.JavaRodsKickstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import io.reactivex.*;

/* The 'exclude' arguments below are for disabling database on start - remove when needed
 */

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class, 
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class,
        MongoRepositoriesAutoConfiguration.class, })
public class JavaRodsKickstarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaRodsKickstarterApplication.class, args);
		Flowable.just("Hello sick sad wurld").subscribe(System.out::println);
	}
}
