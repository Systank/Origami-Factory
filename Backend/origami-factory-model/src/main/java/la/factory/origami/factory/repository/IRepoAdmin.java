package la.factory.origami.factory.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import la.factory.origami.factory.model.Admin;




public interface IRepoAdmin extends JpaRepository<Admin, Long> {


	@Query("select a from Admin a where a.id = :id")
	Admin findByIdd(@Param("id")Long id);


	
	
	
}
