package testm.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import testm.data.model.Catalog;

/**
 * 
 * @author mk
 * 
 * JPA repository interface for Catalog entity
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {


}
