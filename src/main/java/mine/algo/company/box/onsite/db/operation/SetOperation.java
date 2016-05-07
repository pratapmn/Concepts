package mine.algo.company.box.onsite.db.operation;

import mine.algo.company.box.onsite.db.InMemDB.DB;
import mine.algo.company.box.onsite.db.facade.Operation;
import mine.algo.company.box.onsite.db.facade.Transaction;

/**
 * Created by pratapn on 4/27/16.
 */
public class SetOperation extends Transaction {

    String key;
    Integer val;
    Integer prevVal;

    public SetOperation(String key, Integer val){
        this.key = key;
        this.val = val;
    }

    public SetOperation(DB db, String key, Integer val){
        super(db);
        this.key = key;
        this.val = val;
        this.prevVal = db.inDB.get(key);
    }

    @Override
    public void doOp(DB db) {
        Integer tVal = db.inDB.get(key);
        db.inDB.put(key, val);
        db.valIndex.put(val, db.valIndex.getOrDefault(val, 0) + 1);
        if(tVal != null){
            db.valIndex.put(tVal, db.valIndex.get(tVal) - 1);
        }
    }

    @Override
    public void undoOp(DB db) {
        Operation setOp = new SetOperation(key, prevVal);
        setOp.doOp(db);

    }

    @Override
    public Integer getResult() {
        return null;
    }
}
