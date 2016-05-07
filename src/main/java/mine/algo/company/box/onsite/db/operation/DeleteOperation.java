package mine.algo.company.box.onsite.db.operation;

import mine.algo.company.box.onsite.db.InMemDB.DB;
import mine.algo.company.box.onsite.db.facade.Transaction;

/**
 * Created by pratapn on 4/27/16.
 */
public class DeleteOperation extends Transaction {

    private String key;
    private Integer value;
    public DeleteOperation(DB db, String key){
        super(db);
        this.key = key;
    }

    @Override
    public void doOp(DB db) {
        this.value = db.inDB.get(key);
        if(db.inDB.containsKey(key)){
            db.inDB.remove(key);
        }
        if(value != null){
            db.valIndex.put(value, db.valIndex.get(value) - 1);
        }
    }

    @Override
    public void undoOp(DB db) {
        Transaction setOp = new SetOperation(db, key, value);
        setOp.doOp(db);
    }

    @Override
    public Integer getResult() {
        return null;
    }
}
