package com.exception;

/**
 * Created by jagtapm on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user1 = new User(16, "Mahesh", 29, 4);
        User user2 = new User(13, "Jagtap", 7, 1);
        User user3 = new User(12, "Sameer", 29, 3);
        User user4 = new User(11, "Ma", -2, 5);

        try {
            MovieService.buy(user1, 20000);
            MovieService.watch(user2);
        } catch (InvalidPriceException e) {
            System.out.println(e.getMessage());
        } catch (PriceLessThan2KException e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (AgeOutOfRangeException e) {
             System.out.println(e.getMessage());
        } catch (RatingBelow3Exception e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
