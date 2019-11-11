package labsproject.api.repository;


import org.springframework.data.repository.CrudRepository;
import labsproject.api.entity.Faculty;

public interface IFacultyRepository extends CrudRepository<Faculty, Long>{

}
