package SpringBoot.data_analystics.repository;



import SpringBoot.data_analystics.entity.WardDetailsBO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardRepository extends JpaRepository<WardDetailsBO, Long> {

}
