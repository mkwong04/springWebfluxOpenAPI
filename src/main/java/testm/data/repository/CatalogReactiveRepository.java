package testm.data.repository;

import reactor.core.publisher.Flux;
import testm.data.model.Catalog;

/**
 * 
 * @author mk
 * 
 * reactive wrapper interface for non reactive repository interface
 *
 */
public interface CatalogReactiveRepository {
	Flux<Catalog> findAllCatalog();
}
