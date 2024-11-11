package com.BookStore.BookMgt_FullStack.Repository;

import com.BookStore.BookMgt_FullStack.Entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookListRepository extends JpaRepository<MyBookList,Long> {
}
