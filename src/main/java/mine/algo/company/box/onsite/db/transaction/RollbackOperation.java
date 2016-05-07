package mine.algo.company.box.onsite.db.transaction;

import mine.algo.company.box.onsite.db.InMemDB;
import mine.algo.company.box.onsite.db.facade.Operation;

import java.util.Stack;

/**
 * Created by pratapn on 4/27/16.
 */
public class RollbackOperation implements Operation {
    @Override
    public void doOp(InMemDB.DB db) {
        Stack<Operation> tStack = db.tStack;
        if(tStack.isEmpty()) return;
        do{
            Operation transaction = tStack.pop();
            transaction.undoOp(db);

        }while(!(tStack.pop() instanceof BeginOperation));
    }

    @Override
    public void undoOp(InMemDB.DB db) {

    }

    @Override
    public Integer getResult() {
        return null;
    }
}
