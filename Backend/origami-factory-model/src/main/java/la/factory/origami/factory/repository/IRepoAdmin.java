package la.factory.origami.factory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import la.factory.origami.factory.model.Admin;

public interface IRepoAdmin extends JpaRepository<Admin, Long> {

}