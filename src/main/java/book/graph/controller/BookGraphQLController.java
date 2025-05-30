package book.graph.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;

import book.graph.api.BookGenreEnum;
import book.graph.dto.BookCredentialsDto;
import book.graph.dto.BookDto;
import book.graph.dto.BookReservedDto;
import book.graph.service.BookService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookGraphQLController {

	private final BookService bookService;

	@QueryMapping
	public List<BookDto> allBooks() {
		return bookService.getAll2();
	}

	@QueryMapping
	public List<BookCredentialsDto> booksByGenre(@Argument BookGenreEnum bookGenre) {
		return bookService.getBooksByGenre(bookGenre);
	}

	@QueryMapping
	public List<BookCredentialsDto> booksByGenreAndPages(@Argument BookGenreEnum bookGenre, @Argument int min,
			@Argument int max) {
		return bookService.getBooksByGenreAndPages(bookGenre, min, max);
	}

	@QueryMapping
	public List<BookCredentialsDto> booksByGenreAndPagesAsc(@Argument BookGenreEnum bookGenre, @Argument int min,
			@Argument int max) {
		return bookService.getBooksByGenreAndPagesOrdered(bookGenre, min, max);
	}

	@QueryMapping
	public List<BookReservedDto> reservedBooks() {
		return bookService.getReservedBooks();
	}

	@QueryMapping
	public List<BookDto> freeBooks() {
		return bookService.getFreeBooks();
	}

	@MutationMapping
	public int reserveBook(@Argument String title) {
		return bookService.setBookReserved(title);
	}

	@MutationMapping
	public int freeBook(@Argument String title) {
		return bookService.setBookFree(title);
	}

}
