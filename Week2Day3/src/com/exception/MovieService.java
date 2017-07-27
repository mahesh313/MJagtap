package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class MovieService {
    static public void buy(User user, double price) throws AgeOutOfRangeException, InvalidAgeException, InvalidPriceException, PriceLessThan2KException, RatingBelow3Exception {
        if (price < 0) {
            InvalidPriceException invalidPriceException = new InvalidPriceException("price cannot be negative");
            throw invalidPriceException;
        }

        if (price < 2000) {
            PriceLessThan2KException priceLessThan2KException = new PriceLessThan2KException("price less than 2000");
            throw priceLessThan2KException;
        }

        if(user.getAge() < 0) {
            InvalidAgeException invalidAgeException = new InvalidAgeException("age cannot be negative");
            throw invalidAgeException;
        }

        if(user.getAge() < 10) {
            AgeOutOfRangeException ageOutOfRangeException = new AgeOutOfRangeException("age cannot be less than 10");
            throw ageOutOfRangeException;
        }

        if(user.getAge() < 20) {
            AgeOutOfRangeException ageOutOfRangeException = new AgeOutOfRangeException("age cannot be less than 20");
            throw ageOutOfRangeException;
        }

        if (user.getRating() < 3) {
            RatingBelow3Exception ratingBelow3Exception = new RatingBelow3Exception("rating below 3");
            throw ratingBelow3Exception;
        }
        System.out.println("Enjoy movie with popcorn !!!");


    }

    static public void watch(User user) throws AgeOutOfRangeException, InvalidAgeException, RatingBelow3Exception{
        if(user.getAge() < 0) {
            InvalidAgeException invalidAgeException = new InvalidAgeException("age cannot be negative");
            throw invalidAgeException;
        }

        if(user.getAge() < 10) {
            AgeOutOfRangeException ageOutOfRangeException = new AgeOutOfRangeException("age cannot be less than 10");
            throw ageOutOfRangeException;
        }

        if(user.getAge() < 20) {
            AgeOutOfRangeException ageOutOfRangeException = new AgeOutOfRangeException("age cannot be less than 20");
            throw ageOutOfRangeException;
        }

        if (user.getRating() < 3) {
            RatingBelow3Exception ratingBelow3Exception = new RatingBelow3Exception("rating below 3");
            throw ratingBelow3Exception;
        }
        System.out.println("Enjoy movie with popcorn !!!");



    }

}
