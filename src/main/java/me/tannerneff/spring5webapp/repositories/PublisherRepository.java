package me.tannerneff.spring5webapp.repositories;

import me.tannerneff.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
