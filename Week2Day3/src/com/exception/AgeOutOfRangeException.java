package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class AgeOutOfRangeException extends Exception {
    public AgeOutOfRangeException() {
    }

    public AgeOutOfRangeException(String message) {
        super(message);
    }
}
