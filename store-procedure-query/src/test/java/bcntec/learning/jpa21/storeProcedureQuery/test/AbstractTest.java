package bcntec.learning.jpa21.storeProcedureQuery.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author francisco.philip@gmail.com
 */
public abstract class AbstractTest extends Assert {
    static EntityManagerFactory factory;

    @BeforeClass
    public static void preapre() {

        factory = Persistence.createEntityManagerFactory("jpa21:store-procedure-query");

    }
    @AfterClass
    public static void close(){
        factory.close();
    }


}
