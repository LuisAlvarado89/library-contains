package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;


import java.awt.print.Book;
import java.time.LocalDate;
import java.util.*;

@Data
@AllArgsConstructor
public class Library {
    private String name;
    private Map<String, Book> booksByIsbn;
    private List<Customer> customers;
    private TreeSet<Booklends> booklends;

    public List<Book> findBooksByGenres(String genres) {
        List<Book> booksGenres = new ArrayList<>();
        for (Book book : booksByIsbn.values()) {
            if (book.getGenres().contains(genres)) {
                booksGenres.add(book);
            }
        }
        return booksGenres;
    }


    public List<Customer> findCustomerByZipCode(int zipCode) {
        List<Customer> customerByZipCode = new ArrayList<>();
        for (Customer customer : customers) {
            if (customer.getZipCode() == zipCode) {
                customerByZipCode.add(customer);
            }
        }
        return customerByZipCode;
    }

    public Booklends bookDateNow(String nif, String isbn) {
        return new Booklends(
                isbn,
                LocalDate.now(),
                nif
        );
    }

    public void deleteBookByIsbnGenre(String isbn, String genre) {
        if (booksByIsbn.containsKey(isbn)) {
            booksByIsbn.get(isbn).getGenres().remove(genre);
        }
    }

    public Customer findCustomerByNumber(int customerNumber) {
        for (Customer customer : customers) {
            if (customer.getCustomerNumber() == customerNumber) {
                return customer;
            }
        }
        return null;
    }

    public Boolean customerLends(String isbn, int customerNumber) {
        Customer customer = findCustomerByNumber(customerNumber);
        for (Booklends book : booklends) {
            if (book.getIsbn().equals(isbn) && book.getNif().equals(customer.getNif())) {
                return true;
            }
        }
        return false;
    }

    public Set<String> findGenreByIsbn(String isbn) {
        if (booksByIsbn.containsKey(isbn)){
            return booksByIsbn.get(isbn).getGenres();
        }
        return null ;
    }


}

