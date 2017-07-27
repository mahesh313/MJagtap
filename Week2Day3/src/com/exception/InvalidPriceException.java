package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class InvalidPriceException extends Exception {
    public InvalidPriceException() {
    }

    public InvalidPriceException(String message) {
        super(message);
    }
}
