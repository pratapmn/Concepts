package mine.algo.company.box.onsite.db.operation;

import mine.algo.company.box.onsite.db.InMemDB;
import mine.algo.company.box.onsite.db.facade.Transaction;

/**
 * Created by pratapn on 4/27/16.
 */
public class CountOperation extends Transaction {

    private Integer key;
    private Integer result;
    public CountOperation(InMemDB.DB db, Integer key){
        super(db);
        this.key = key;
    }

    @Override
    public void doOp(InMemDB.DB db) {
        result = db.valIndex.getOrDefault(key, 0);
    }

    @Override
    public void undoOp(InMemDB.DB db) {
        return;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}
