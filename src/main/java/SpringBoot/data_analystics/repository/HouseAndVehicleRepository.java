package SpringBoot.data_analystics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.data_analystics.entity.HouseAndVehicleBO;

@Repository
public interface HouseAndVehicleRepository extends JpaRepository<HouseAndVehicleBO, Long> {

}
