package book.graph.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import book.graph.entity.BookCredential;

public interface CredentialRepository extends JpaRepository<BookCredential, Integer> {


}
