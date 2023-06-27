package testm.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import testm.data.model.Catalog;

public interface CatalogRepository extends JpaRepository<Catalog, Long> {


}
