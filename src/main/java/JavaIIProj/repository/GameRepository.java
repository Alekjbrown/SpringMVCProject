package JavaIIProj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import JavaIIProj.beans.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long>{

}
