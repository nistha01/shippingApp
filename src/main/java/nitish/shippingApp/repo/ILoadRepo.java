package nitish.shippingApp.repo;

import nitish.shippingApp.model.Load;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ILoadRepo extends CrudRepository<Load,Long> {





    List<Load> findLoadByUuid(Long id);
}
