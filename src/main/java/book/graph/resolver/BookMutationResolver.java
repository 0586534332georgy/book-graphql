package book.graph.resolver;

import org.springframework.stereotype.Component;

import book.graph.service.BookService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BookMutationResolver implements GraphQLMutationResolver {

    private final BookService bookService;

    
    public int reserveBook(String title) {
        return bookService.setBookReserved(title);
    }

    
    public int freeBook(String title) {
        return bookService.setBookFree(title);
    }
}
