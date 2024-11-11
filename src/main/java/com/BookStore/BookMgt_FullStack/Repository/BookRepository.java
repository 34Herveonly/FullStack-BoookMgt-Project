package com.BookStore.BookMgt_FullStack.Repository;

import com.BookStore.BookMgt_FullStack.Entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Long> {
}
