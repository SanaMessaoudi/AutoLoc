package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domain.Contract;

@Repository
public interface ContractRepository extends JpaRepository <Contract,Long> {
}
