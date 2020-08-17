package com.barclays;

public class PersonCannotVoteException extends Exception {
    

    private String maessage;

    public PersonCannotVoteException(String message){
        super(message);
        this.maessage = message;
    }

}