package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yangwenhan on 2018/1/18.
 */

public abstract class Mood {
    private Date date;

    public Mood(Date date){
        this.date = date;
    }

    public Mood(){
        this.date = new Date();
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public abstract String printMood();

}
