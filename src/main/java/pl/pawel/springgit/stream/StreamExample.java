package pl.pawel.springgit.stream;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//j
public class StreamExample {
    private static final Logger log = LoggerFactory.getLogger(StreamExample.class);

    public static void main(String[] args) {
        List<String> colors = Arrays.asList(
                "white",
                "black",
                "blue",
                "red",
                "pink",
                "gray"
        );

        colors.stream()
                .filter(s -> {
                    boolean test = s.length() >= 4;
                    log.info("Testing object [{}] - passed ? [{}]",s,s.length() >= 4);
                    return test;} )
                .map(s -> {
                    log.info("mapping object [{}]",s);
                    return s.length();})
                .collect(Collectors.toList())
                .forEach(integer -> System.out.println("number: [" + integer + "]"));
    }
}
