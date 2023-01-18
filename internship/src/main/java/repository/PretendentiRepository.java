package repository;

import entity.Pretendenti;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;


@RepositoryRestResource(collectionResourceRel = "cars", path = "cars")
@CrossOrigin(origins = "*")
public interface PretendentiRepository extends JpaRepository<Pretendenti, Integer> {
}
