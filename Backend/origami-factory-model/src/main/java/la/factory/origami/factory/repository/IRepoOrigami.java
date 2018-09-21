package la.factory.origami.factory.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import la.factory.origami.factory.model.Origami;


public interface IRepoOrigami extends JpaRepository<Origami, Long>{

	@Query("select distinct o from Origami o left join fetch o.etapes e where o.id = :id order by e.numeroEtape")
	Origami findOrigamiWithEtapes(@Param("id") Long id);

}
