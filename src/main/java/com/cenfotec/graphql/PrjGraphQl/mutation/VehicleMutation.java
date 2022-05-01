package com.cenfotec.graphql.PrjGraphQl.mutation;

import com.cenfotec.graphql.PrjGraphQl.entities.Vehicle;
import com.cenfotec.graphql.PrjGraphQl.services.VehicleService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
