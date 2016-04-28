package mine.algo.company.box.onsite.facade;

import mine.algo.company.box.onsite.InMemDB.DB;

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
