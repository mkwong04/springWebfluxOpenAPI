package testm.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import testm.data.model.Fish;

@Repository
public class FishReactiveRepositoryImpl implements FishReactiveRepository {

	@Autowired
	private FishRepository repo;
	
	@Override
	public Flux<Fish> findAllFishes() {
		return Flux.fromIterable(repo.findAll());
	}

}
