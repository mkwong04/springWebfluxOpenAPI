package testm.data.repository;

import reactor.core.publisher.Flux;
import testm.data.model.Catalog;

public interface CatalogReactiveRepository {
	Flux<Catalog> findAllCatalog();
}
