package com.polarbookshop.catalogService.domain;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super("The book with the ISBN " + isbn + " already exists.");
    }
}
