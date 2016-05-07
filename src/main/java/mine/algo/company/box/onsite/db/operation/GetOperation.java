package mine.algo.company.box.onsite.db.operation;

import mine.algo.company.box.onsite.db.InMemDB.DB;
import mine.algo.company.box.onsite.db.facade.Operation;

/**
 * Created by pratapn on 4/27/16.
 */
public class GetOperation implements Operation {

    String key;
    Integer result;
    public GetOperation(String key){
        this.key = key;
    }

    @Override
    public void doOp(DB db) {
        result = db.inDB.get(key);
    }

    @Override
    public void undoOp(DB db) {
        return;
    }

    @Override
    public Integer getResult() {
        return result;
    }
}