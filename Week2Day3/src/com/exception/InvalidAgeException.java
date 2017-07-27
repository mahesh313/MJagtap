package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
