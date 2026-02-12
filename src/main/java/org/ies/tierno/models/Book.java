package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class Book {
    private String isbn;
    private String tittle;
    private String author;
    private Set<String> genres;
}
