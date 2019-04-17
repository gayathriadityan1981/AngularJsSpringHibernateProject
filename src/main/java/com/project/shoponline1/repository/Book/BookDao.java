package com.project.shoponline1.repository.Book;
import java.util.List;
import com.project.shoponline1.model.Book;

public interface BookDao {

   long save(Book book);
   Book get(long id);
   List<Book> list();
   void update(long id, Book book);
   void delete(long id);

}
