package com.kodillagoodpatterns.challenges;

public class GoodPatternsMain{
        public static void main(String[] args){

            MovieStories.getMovies()
                    .entrySet()
                    .stream()
                    .flatMap(m -> m.getValue().stream())
                    .map(s -> s + "!")
                    .forEach(System.out::print);

        }
}
