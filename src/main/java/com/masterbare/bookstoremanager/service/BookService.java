package com.masterbare.bookstoremanager.service;

import com.masterbare.bookstoremanager.dto.MessageResponseDTO;
import com.masterbare.bookstoremanager.entity.Book;
import com.masterbare.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(Book book){
        Book saveBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + saveBook.getId())
                .build();
    }

}
