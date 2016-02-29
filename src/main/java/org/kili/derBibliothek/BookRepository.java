package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByBookBarCode(@Param("bookBarCode") String bookBarCode);

}
