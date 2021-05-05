package com.sds3.dsvendas.repositories;

import com.sds3.dsvendas.entities.Sale;
import com.sds3.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
