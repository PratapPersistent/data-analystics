package SpringBoot.data_analystics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.data_analystics.entity.DocumentDetailsBO;


@Repository
public interface DocumentDetailsRepository extends JpaRepository<DocumentDetailsBO, Long>{

}
