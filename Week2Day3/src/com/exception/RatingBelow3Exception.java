package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class RatingBelow3Exception extends Exception {
    public RatingBelow3Exception() {
    }

    public RatingBelow3Exception(String message) {
        super(message);
    }
}
