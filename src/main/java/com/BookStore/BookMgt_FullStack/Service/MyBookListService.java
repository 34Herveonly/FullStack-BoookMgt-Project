package com.BookStore.BookMgt_FullStack.Service;

import com.BookStore.BookMgt_FullStack.Entity.MyBookList;
import com.BookStore.BookMgt_FullStack.Repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private final MyBookListRepository myBookListRepository;

    public MyBookListService(MyBookListRepository myBookListRepository) {
        this.myBookListRepository = myBookListRepository;

         }

    public void saveMyBookList(MyBookList bookList){
        myBookListRepository.save(bookList);

        }

    public List<MyBookList> getMyBookList(){
        return myBookListRepository.findAll();

        }

    public void deleteMyBookListById(long id){
        myBookListRepository.deleteById(id);

        }
    }