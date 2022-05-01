package com.cenfotec.graphql.PrjGraphQl.repositories;

import com.cenfotec.graphql.PrjGraphQl.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
