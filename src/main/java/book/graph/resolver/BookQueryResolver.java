package book.graph.resolver;

import java.util.List;

import org.springframework.stereotype.Component;

import book.graph.api.BookGenreEnum;
import book.graph.dto.BookCredentialsDto;
import book.graph.dto.BookDto;
import book.graph.dto.BookReservedDto;
import book.graph.service.BookService;

import graphql.kickstart.tools.GraphQLQueryResolver;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookQueryResolver implements GraphQLQueryResolver {

	private final BookService bookService;

	public List<BookDto> allBooks() {
		return bookService.getAll2();
	}

	public List<BookCredentialsDto> booksByGenre(BookGenreEnum bookGenre) {
		return bookService.getBooksByGenre(bookGenre);
	}

	public List<BookCredentialsDto> booksByGenreAndPages(BookGenreEnum bookGenre, int min, int max) {
		return bookService.getBooksByGenreAndPages(bookGenre, min, max);
	}

	public List<BookCredentialsDto> booksByGenreAndPagesAsc(BookGenreEnum bookGenre, int min, int max) {
		return bookService.getBooksByGenreAndPagesOrdered(bookGenre, min, max);
	}

	public List<BookReservedDto> reservedBooks() {
		return bookService.getReservedBooks();
	}

	public List<BookDto> freeBooks() {
		return bookService.getFreeBooks();
	}
}
