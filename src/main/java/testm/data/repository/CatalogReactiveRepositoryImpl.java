package testm.data.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import testm.data.model.Catalog;

@Repository
public class CatalogReactiveRepositoryImpl implements CatalogReactiveRepository {
	
	@Autowired
	private CatalogRepository repo;

	@Deprecated
	public void flush() {
		repo.flush();
	}

	@Deprecated
	public <S extends Catalog> S saveAndFlush(S entity) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> List<S> saveAllAndFlush(Iterable<S> entities) {
		return null;
	}

	@Deprecated
	public void deleteAllInBatch(Iterable<Catalog> entities) {
	}

	@Deprecated
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
	}

	@Deprecated
	public void deleteAllInBatch() {
	}

	@Deprecated
	public Catalog getOne(Long id) {
		return null;
	}

	@Deprecated
	public Catalog getById(Long id) {
		return null;
	}

	@Deprecated
	public Catalog getReferenceById(Long id) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> List<S> findAll(Example<S> example) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> List<S> findAll(Example<S> example, Sort sort) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	@Deprecated
	public List<Catalog> findAll() {
		return null;
	}

	@Deprecated
	public List<Catalog> findAllById(Iterable<Long> ids) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> S save(S entity) {
		return null;
	}

	@Deprecated
	public Optional<Catalog> findById(Long id) {
		return Optional.empty();
	}

	@Deprecated
	public boolean existsById(Long id) {
		return false;
	}

	@Deprecated
	public long count() {
		return 0;
	}

	@Deprecated
	public void deleteById(Long id) {
	}

	@Deprecated
	public void delete(Catalog entity) {
	}

	@Deprecated
	public void deleteAllById(Iterable<? extends Long> ids) {
	}

	@Deprecated
	public void deleteAll(Iterable<? extends Catalog> entities) {
	}

	@Deprecated
	public void deleteAll() {
	}

	@Deprecated
	public List<Catalog> findAll(Sort sort) {
		return null;
	}

	@Deprecated
	public Page<Catalog> findAll(Pageable pageable) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> Optional<S> findOne(Example<S> example) {
		return Optional.empty();
	}

	@Deprecated
	public <S extends Catalog> Page<S> findAll(Example<S> example, Pageable pageable) {
		return null;
	}

	@Deprecated
	public <S extends Catalog> long count(Example<S> example) {
		return 0;
	}

	@Deprecated
	public <S extends Catalog> boolean exists(Example<S> example) {
		return false;
	}

	@Deprecated
	public <S extends Catalog, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		return null;
	}

	@Override
	public Flux<Catalog> findAllCatalog() {
		return Flux.fromIterable(repo.findAll());
	}

}
