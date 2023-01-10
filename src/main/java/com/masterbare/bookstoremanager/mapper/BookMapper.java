package com.masterbare.bookstoremanager.mapper;

import com.masterbare.bookstoremanager.dto.BookDTO;
import com.masterbare.bookstoremanager.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
