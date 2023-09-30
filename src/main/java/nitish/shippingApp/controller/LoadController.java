package nitish.shippingApp.controller;

import nitish.shippingApp.model.Load;
import nitish.shippingApp.service.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoadController {
    @Autowired
    LoadService loadService;
    @PostMapping("load")
    public String addLoad(@RequestBody Load load){
      return loadService.addLoad(load);
    }
    @PostMapping("loads")
    public String addLoads(@RequestBody List<Load> loads){
        return loadService.addLoads(loads);
    }

    @PutMapping("load/{id}")
    public String updateLoad(@RequestBody Load load,@PathVariable Long id){
        return loadService.updateLoad(load,id);
    }
    @GetMapping("loads")
    public List<Load> getLoadsById(@RequestParam Long id){
        return loadService.getLoadsById(id);
    }
    @GetMapping("load/{id}")
    public Load getLoadByLoadId(@PathVariable Long id){
        return loadService.getLoadByLoadId(id);
    }
    @DeleteMapping("load/{id}")
    public String deleteLoadById(@PathVariable Long id){
        return loadService.deleteLoadById(id);
    }

}
