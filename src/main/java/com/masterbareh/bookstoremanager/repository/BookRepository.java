package com.masterbareh.bookstoremanager.repository;

import com.masterbareh.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
