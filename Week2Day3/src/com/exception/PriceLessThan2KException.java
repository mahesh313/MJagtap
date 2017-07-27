package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class PriceLessThan2KException extends Exception {
    public PriceLessThan2KException() {
    }

    public PriceLessThan2KException(String message) {
        super(message);
    }
}
