package nitish.shippingApp.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.shippingApp.model.Load;
import nitish.shippingApp.repo.ILoadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Service
public class LoadService {
    @Autowired
    ILoadRepo iLoadRepo;

    public String addLoad(Load load) {
        iLoadRepo.save(load);
        return "loads details added successfully";
    }

    public String updateLoad(Load load, Long id) {
        Load curLoad=iLoadRepo.findById(id).orElse(null);
        if(curLoad!=null){
            curLoad.setLoadingPoint(load.getLoadingPoint());
            curLoad.setLoadWeight(load.getLoadWeight());
            curLoad.setDate(load.getDate());
            curLoad.setProductType(load.getProductType());
            curLoad.setComments(load.getComments());
            curLoad.setNumberOfTruck(load.getNumberOfTruck());
            curLoad.setUnloadingPoint(load.getUnloadingPoint());
            curLoad.setTruckType(load.getTruckType());
            return "Load updated";
        }
        return "invalid Id";
    }

    public List<Load> getLoadsById(Long id) {
       return (List<Load>) iLoadRepo.findLoadByUuid(id);
    }

    public Load getLoadByLoadId(Long id) {
        return  iLoadRepo.findById(id).orElse(null);

    }

    public String deleteLoadById(Long id) {
        Load curLoad=iLoadRepo.findById(id).orElse(null);
        if(curLoad!=null){
            iLoadRepo.deleteById(id);
            return "Load deleted";
        }
        return "Invalid Id";
    }

    public String addLoads(List<Load> loads) {
        iLoadRepo.saveAll(loads);
        return "List of Loads Added";
    }
}
