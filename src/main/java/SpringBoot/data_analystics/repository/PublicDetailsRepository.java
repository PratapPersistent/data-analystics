package SpringBoot.data_analystics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.data_analystics.entity.PublicDetailsBO;


@Repository
public interface PublicDetailsRepository extends JpaRepository<PublicDetailsBO, Long> {

}
