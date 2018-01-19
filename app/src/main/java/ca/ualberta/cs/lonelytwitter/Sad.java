package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Created by yangwenhan on 2018/1/18.
 */

public class Sad extends Mood {

    private String message;

    public Sad(){
        super();
    }

    public Sad(Date date){
        super(date);
    }

    @Override
    public String printMood(){
        message = "I am sad";
        return message;
    }
}
