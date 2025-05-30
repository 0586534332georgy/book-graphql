package book.graph.service;

import java.util.List;

import book.graph.api.BookGenreEnum;
import book.graph.dto.BookCredentialsDto;
import book.graph.dto.BookDto;
import book.graph.dto.BookReservedDto;
import book.graph.entity.Book;


public interface BookService {

	public List<Book> getAll();

	public List<BookDto> getAll2();

	public List<BookCredentialsDto> getBooksByGenre(BookGenreEnum bookGenre);

	public List<BookCredentialsDto> getBooksByGenreAndPages(BookGenreEnum bookGenre, int min, int max);

	public List<BookCredentialsDto> getBooksByGenreAndPagesOrdered(BookGenreEnum bookGenre, int min, int max);

	public List<BookDto> getFreeBooks();

	public List<BookReservedDto> getReservedBooks();

	public int setBookFree(String title);

	public int setBookReserved(String title);

}