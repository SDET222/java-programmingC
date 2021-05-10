package day05_primitives_cancatanation;

public class Movie {
    public static void main (String [] args) {
        /* Create a class Movie
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        name, genre, duration, release date, rating(G, PG, R, etc..), is a sequels or not,
         rotten tomatoes rating (out of 100), is on dvd.

    - Print out the Movie information using concatenations and print statements

    ------ Welcome to the Cinema ------

    Tonight we are streaming "$movieName" which was released on $releaseDate
    This $genre movie got a $rottenTomatoesRating rating on Rotten Tomatoes.
    The rating is $rating and it runs for $duration hours.
    This is a sequel $isSequel and is on dvd $isOnDvd. */


       String $name = "\"The Invisible Guest\"";
       String $genre = "Thriller";
       float $duration = 1.76f;
       String $releaseDate = "March 1st 2016";
       String $rating = "PG";
       boolean isSequels = true;
       byte $rotRating = 92;
       boolean isOnDvd = true;

       System.out.println("------Welcome to the Cinema------");
        System.out.println("");
        System.out.println("Tonight we are streaming "+$name+" which was released on "
        +$releaseDate);
        System.out.println("This "+$genre+" movie got a "+$rotRating+" rating on Rotten Tomatoes.");
        System.out.println("The rating is "+$rating+" and it runs for "+$duration
        +" hours.");
        System.out.println("This is a sequel "+isSequels+" and is on dvd "+isOnDvd+".");



    }





}
