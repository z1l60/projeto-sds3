package com.sds3.dsvendas.service;

import com.sds3.dsvendas.dto.SaleDTO;
import com.sds3.dsvendas.entities.Sale;
import com.sds3.dsvendas.repositories.SaleRepository;
import com.sds3.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

    @Autowired
    SaleRepository repository;

    @Autowired
    SellerRepository sellerRepository;

    @Transactional
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

}
