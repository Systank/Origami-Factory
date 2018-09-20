package la.factory.origami.factory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import la.factory.origami.factory.model.Categorie;



public interface IRepoCategorie extends JpaRepository<Categorie, Long> {


	@Query("select c from Categorie c left join fetch c.origamis o where c.id = :id")
	Categorie findByIdWithOrigamis(@Param("id") Long id);
    @Query("select distinct c from Categorie c left join fetch c.sousCats s where s.id = :id")
	Categorie findByIdWithCategories(Long id);



	
   
	

}
