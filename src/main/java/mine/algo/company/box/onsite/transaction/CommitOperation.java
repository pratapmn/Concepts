package mine.algo.company.box.onsite.transaction;

import mine.algo.company.box.onsite.InMemDB;
import mine.algo.company.box.onsite.facade.Operation;

/**
 * Created by pratapn on 4/27/16.
 */
public class CommitOperation implements Operation {

    @Override
    public void doOp(InMemDB.DB db) {
        db.tStack.clear();
    }

    @Override
    public void undoOp(InMemDB.DB db) {

    }

    @Override
    public Integer getResult() {
        return null;
    }
}
