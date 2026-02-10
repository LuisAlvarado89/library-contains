package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class BooksByIsbn {
    private String isbn;
    private String tittle;
    private String author;
    private Set<String> genres;
}
