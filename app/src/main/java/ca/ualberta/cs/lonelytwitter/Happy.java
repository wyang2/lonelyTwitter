package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yangwenhan on 2018/1/18.
 */

public class Happy extends Mood {
    private String message;

    public Happy(){
        super();
    }

    public Happy(Date date){
        super(date);
    }

    @Override
    public String printMood(){
        message = "I am happy";
        return message;
    }
}
