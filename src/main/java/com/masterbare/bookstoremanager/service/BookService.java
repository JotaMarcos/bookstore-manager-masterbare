package com.masterbare.bookstoremanager.service;

import com.masterbare.bookstoremanager.dto.BookDTO;
import com.masterbare.bookstoremanager.dto.MessageResponseDTO;
import com.masterbare.bookstoremanager.entity.Book;
import com.masterbare.bookstoremanager.mapper.BookMapper;
import com.masterbare.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public MessageResponseDTO create(BookDTO bookDTO){
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book saveBook = bookRepository.save(bookToSave);
        return MessageResponseDTO.builder()
                .message("Book created with ID " + saveBook.getId())
                .build();
    }

}
