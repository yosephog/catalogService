package com.polarbookshop.catalogService.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("The book with the ISBN " + isbn + " was not found.");
    }
}
