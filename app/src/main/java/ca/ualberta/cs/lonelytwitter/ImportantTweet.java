package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yangwenhan on 2018/1/18.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    //automatically get access to getter and setter
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }

}
