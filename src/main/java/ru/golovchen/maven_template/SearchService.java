package ru.golovchen.maven_template;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SearchService {
    public List<String> find(String query) {
        return Arrays.asList("asdf", "efheihf");
    }
}
