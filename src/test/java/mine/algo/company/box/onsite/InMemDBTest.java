package mine.algo.company.box.onsite;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by pratapn on 4/27/16.
 */
public class InMemDBTest {

    InMemDB inMemDB = new InMemDB();

    @Test
    public void testSet() throws Exception {
        inMemDB.set("A", 10);
        Assert.assertEquals(10, inMemDB.get("A"));
        inMemDB.begin();
        inMemDB.set("A", 20);
        Assert.assertEquals(20, inMemDB.get("A"));
        inMemDB.rollback();
        Assert.assertEquals(10, inMemDB.get("A"));
        inMemDB.begin();
        inMemDB.set("A", 30);
        inMemDB.commit();
        inMemDB.rollback();
        Assert.assertEquals(30, inMemDB.get("A"));
    }

    @Test
    public void testGet() throws Exception {
        inMemDB.set("A", 10);
        Assert.assertEquals(10, inMemDB.get("A"));
    }

    @Test
    public void testDelete() throws Exception {
        inMemDB.delete("A");
        Assert.assertEquals(null, inMemDB.get("A"));
        inMemDB.set("A", 10);

        // rollback case
        inMemDB.begin();
        inMemDB.delete("A");
        Assert.assertEquals(null, inMemDB.get("A"));
        inMemDB.rollback();
        Assert.assertEquals(10, inMemDB.get("A"));

        // Commit case
    }

    @Test
    public void testCount() throws Exception {

    }
}