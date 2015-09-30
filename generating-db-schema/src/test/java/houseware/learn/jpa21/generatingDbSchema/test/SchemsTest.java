package houseware.learn.jpa21.generatingDbSchema.test;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fphilip@houseware.es
 */
public class SchemsTest {


    @Test
    public void simple() {
        schema("jpa21:simple");
    }

    @Test
    public void collections() {
        schema("jpa21:collections");
    }

    @Test
    public void relations() {
        schema("jpa21:relations");
    }

    @Test
    public void secondary_table() {
        schema("jpa21:secondary-table");
    }

    @Test
    public void inheritance() {
        schema("jpa21:inheritance");
    }


    @Test
    public void polymorphic() {
        schema("jpa21:polymorphic");
    }

    private void schema(String pu) {

        Map<String, Object> p = new HashMap<>();


        p.put("hibernate.hbm2ddl.auto", "drop-and-create");
        p.put("javax.persistence.schema-generation.scripts.action", "drop-and-create");
        p.put("javax.persistence.schema-generation.scripts.drop-target", "./" + pu + ".ddl");
        p.put("javax.persistence.schema-generation.scripts.create-target", "./" + pu + ".ddl");

         Persistence.generateSchema(pu, p);

    }
}
