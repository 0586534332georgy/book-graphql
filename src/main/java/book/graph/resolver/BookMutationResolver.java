package book.graph.resolver;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;

import book.graph.service.BookService;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookMutationResolver {

    private final BookService bookService;

    @MutationMapping
    public int reserveBook(@Argument String title) {
        return bookService.setBookReserved(title);
    }

    @MutationMapping
    public int freeBook(@Argument String title) {
        return bookService.setBookFree(title);
    }
}
