package com.example.dictionary;

import com.example.dictionary.model.Entry;
import com.example.dictionary.reference.DictionaryReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class DictionaryApplication {

    private static final Logger log = LoggerFactory.getLogger(DictionaryApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DictionaryApplication.class, args);
    }


}

