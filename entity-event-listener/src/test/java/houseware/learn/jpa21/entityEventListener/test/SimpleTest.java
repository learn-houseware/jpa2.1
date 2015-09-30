package houseware.learn.jpa21.entityEventListener.test;

import houseware.learn.jpa21.entityEventListener.simple.Simple;
import org.junit.Test;

/**
 * @author fphilip@houseware.es
 */
public class SimpleTest extends AbstractTest {

    @Test
    public void persist() {
        doCase((entityManager, tx) -> {
           Simple s = new Simple();
            s.setData("persisting my data");
            entityManager.persist(s);
        });


    }


    @Test
    public void remove() {
        doCase((entityManager, tx) -> {
            Simple s = entityManager.find(Simple.class,11L);
            entityManager.remove(s);
        });


    }


    private void doCase(DoIt doIt) {

        doCase("jpa21:simple-event-listener", doIt);
    }

}
