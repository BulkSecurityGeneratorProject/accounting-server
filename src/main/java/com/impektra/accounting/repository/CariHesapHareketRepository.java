package com.impektra.accounting.repository;

import com.impektra.accounting.domain.CariHesapHareket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface CariHesapHareketRepository extends JpaRepository<CariHesapHareket, Long> {

}
