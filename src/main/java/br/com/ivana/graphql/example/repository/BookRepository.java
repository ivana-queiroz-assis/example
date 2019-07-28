package br.com.ivana.graphql.example.repository;

import br.com.ivana.graphql.example.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
