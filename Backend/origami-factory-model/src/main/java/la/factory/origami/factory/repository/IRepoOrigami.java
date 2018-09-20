package la.factory.origami.factory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import la.factory.origami.factory.model.Origami;


public interface IRepoOrigami extends JpaRepository<Origami, Long>{

	@Query("select distinct o from Origami o left join fetch o.etapes e")
	List<Origami> findOrigamiWithEtapesWithCategories();

}
