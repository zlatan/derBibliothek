package org.kili.derBibliothek;

/**
 * Created by zlatan on 29.02.16.
 */

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "student", path = "student")
public interface StudentRepository extends CrudRepository<Student, Long>,PagingAndSortingRepository<Student, Long> {

    Student findByQRCode(@Param("qRCode") String qRCode);
}

