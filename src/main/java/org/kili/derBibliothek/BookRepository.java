package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends CrudRepository<Book, Long>,PagingAndSortingRepository<Book, Long> {

    Book findByBarCode(@Param("barCode") String barCode);
    List<Book> findByAuthorContainingIgnoreCase(@Param("author") String author);

}
