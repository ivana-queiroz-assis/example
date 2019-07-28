package br.com.ivana.graphql.example.service.datafetcher;

import br.com.ivana.graphql.example.model.Book;
import br.com.ivana.graphql.example.repository.BookRepository;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookDataFetcher implements DataFetcher<Book> {
	@Autowired
	BookRepository bookRepository;

	@Override
	public Book get(DataFetchingEnvironment dataFetchingEnvironment) {
		String isn = dataFetchingEnvironment.getArgument("id");
		return bookRepository.findOne(isn);
	}
}
