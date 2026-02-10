package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

@Data
@AllArgsConstructor
public class Library {
    private String name;
    private Map<String, Book> booksByIsbn;
    private List<Customers> customers;
    private TreeSet<Booklends> booklends;
}
