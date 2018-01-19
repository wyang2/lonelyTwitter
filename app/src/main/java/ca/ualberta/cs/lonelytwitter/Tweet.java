package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by yangwenhan on 2018/1/18.
 */

public abstract class Tweet implements Tweetable{
    //abstract class one or more methods declared but not implemented

    private String message;
    private Date date;

    private ArrayList<Mood> moods= new ArrayList<Mood>();

    public Tweet(String message){
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.message = message;
        this.date = new Date(); //set date to a default value
    }
    //getter and setter below

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetToolLongException { //TweetToolLongException:if greater than 140 chars, need a class for that
        if (message.length() > 140){
            throw new TweetToolLongException();
        } else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();

    public void addMood(Mood mood){
        moods.add(mood);

    }

}
