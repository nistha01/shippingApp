package nitish.shippingApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Load {
    @Id
    private Long shipperId;
    private Long uuid;
    private String loadingPoint;
    private String unloadingPoint;
    @Enumerated
    private ProductType productType;
     @Enumerated
    private TruckType truckType;
    private String comments;
    private Integer numberOfTruck;
    private Integer loadWeight;
    private LocalDate date;

}
