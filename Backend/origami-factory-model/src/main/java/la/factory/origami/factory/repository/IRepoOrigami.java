package la.factory.origami.factory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import la.factory.origami.factory.model.Origami;


public interface IRepoOrigami extends JpaRepository<Origami, Long>{

}
