package pl.pawel.springgit.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> maybeNick = findNick();
        if (maybeNick.isPresent()){
            System.out.println(maybeNick.get());
        }
        maybeNick.ifPresent(
                nick -> System.out.println("mam nicka: " + nick)
        );
    }
    private static Optional<String> findNick(){
        System.out.println("searching for nick...");
        return Optional.empty();
    }
}
