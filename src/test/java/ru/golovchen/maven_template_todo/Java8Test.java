package ru.golovchen.maven_template_todo;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Dmitry Golovchenko
 */
public class Java8Test {

    @Test
    public void testJava8IsSupported() {
        Stream.of(1, 2).map(i -> i * 2).collect(Collectors.toList());
    }
}