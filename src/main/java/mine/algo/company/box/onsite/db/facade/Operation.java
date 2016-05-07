package mine.algo.company.box.onsite.db.facade;

import mine.algo.company.box.onsite.db.InMemDB.DB;

/**
 * Created by pratapn on 4/27/16.
 */
public interface Operation {
    public void doOp(DB db);
    public void undoOp(DB db);
    public Integer getResult();
}
