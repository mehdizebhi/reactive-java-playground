package dev.mehdizebhi.reactiveplayground.exercises;

import dev.mehdizebhi.reactiveplayground.sources.ReactiveSources;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(
                x -> System.out.println(x),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Complete")
        );

        // Get the value from the Mono into an integer variable
        Integer number = ReactiveSources.intNumberMono().block();
        System.out.println(number);

        System.out.println("Press a key to end");
        System.in.read();
    }
}
