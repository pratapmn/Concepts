package mine.algo.company.box.onsite.db;

import mine.algo.company.box.onsite.db.facade.Operation;
import mine.algo.company.box.onsite.db.facade.Transaction;
import mine.algo.company.box.onsite.db.operation.CountOperation;
import mine.algo.company.box.onsite.db.operation.DeleteOperation;
import mine.algo.company.box.onsite.db.operation.GetOperation;
import mine.algo.company.box.onsite.db.operation.SetOperation;
import mine.algo.company.box.onsite.db.transaction.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by pratapn on 4/27/16.
 */
public class InMemDB {


    public static class DB {
        public Map<String, Integer> inDB = new HashMap<>();
        public Map<Integer, Integer> valIndex = new HashMap<>();
        public Stack<Operation> tStack = new Stack<>();
    }

    // DB
    private DB myDB = new DB();

    public void set(String key, Integer val) {
        Transaction setOp = new SetOperation(myDB, key, val);
        setOp.doOp(myDB);
    }

    public int get(String key) {
        Operation getOp = new GetOperation(key);
        getOp.doOp(myDB);
        return getOp.getResult();
    }

    public void delete(String key) {
        Transaction deleteOp = new DeleteOperation(myDB, key);
        deleteOp.doOp(myDB);
    }

    public int count(Integer val) {
        Transaction countOp = new CountOperation(myDB, val);
        countOp.doOp(myDB);
        return countOp.getResult();
    }

    public void begin(){
        Operation beginOp = new BeginOperation();
        beginOp.doOp(myDB);
    }

    public void rollback(){
        Operation rollback = new RollbackOperation();
        rollback.doOp(myDB);
    }

    public void commit(){
        Operation commit = new CommitOperation();
        commit.doOp(myDB);
    }
}

