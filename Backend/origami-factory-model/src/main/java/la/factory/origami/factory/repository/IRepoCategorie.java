package la.factory.origami.factory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import la.factory.origami.factory.model.Categorie;

public interface IRepoCategorie extends JpaRepository<Categorie, Long> {

}
