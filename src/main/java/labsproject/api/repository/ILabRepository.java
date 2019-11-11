package labsproject.api.repository;


import org.springframework.data.repository.CrudRepository;
import labsproject.api.entity.Lab;


public interface ILabRepository extends CrudRepository<Lab, Long>{

}
