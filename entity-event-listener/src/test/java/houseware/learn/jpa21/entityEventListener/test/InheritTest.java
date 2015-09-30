package houseware.learn.jpa21.entityEventListener.test;

import houseware.learn.jpa21.entityEventListener.inherit.Inherit;
import org.junit.Test;

/**
 * @author fphilip@houseware.es
 */
public class InheritTest extends AbstractTest {

    @Test
    public void persist() {
        doCase((entityManager, tx) -> {

        });


    }


    @Test
    public void remove() {
        doCase((entityManager, tx) -> {

            Inherit i = entityManager.find(Inherit.class, 33L);

        });


    }

    @Test
    public void update() {
        doCase((entityManager, tx) -> {
            Inherit i = entityManager.find(Inherit.class, 22L);
            i.setData("bye 22");
            entityManager.persist(i);
        });


    }


    private void doCase(DoIt doIt) {

        doCase("jpa21:inherit-event-listener", doIt);
    }


}
