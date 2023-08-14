package testm.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import testm.data.model.Fish;

/**
 * 
 * @author mk
 *
 * JPA repository interface for Fish Entity
 */
public interface FishRepository extends JpaRepository<Fish, String> {

}
