package testm.data.repository;

import reactor.core.publisher.Flux;
import testm.data.model.Fish;

/**
 * 
 * @author mk
 * 
 * reactive wrapper interface for non reactive repository interface
 *
 */
public interface FishReactiveRepository {
	Flux<Fish> findAllFishes();
}
