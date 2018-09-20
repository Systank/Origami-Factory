package la.factory.origami.factory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import la.factory.origami.factory.model.Etape;

public interface IRepoEtape extends JpaRepository<Etape, Long>{

	@Query(select e from Etape e left outer join fetch where )
	List<Etape> findEtapeByOrigami();
		
	

}
