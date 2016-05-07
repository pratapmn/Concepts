package mine.algo.company.box.onsite.db.facade;

import mine.algo.company.box.onsite.db.InMemDB.DB;

/**
 * Created by pratapn on 4/27/16.
 */
public abstract class Transaction implements Operation{

    public Transaction(DB db){
        if(!db.tStack.empty()){
            db.tStack.push(this);
        }
    }

    public Transaction(){

    }
}
