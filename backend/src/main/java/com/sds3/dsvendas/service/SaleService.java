package com.sds3.dsvendas.service;

import com.sds3.dsvendas.dto.SaleDTO;
import com.sds3.dsvendas.dto.SaleSuccessDTO;
import com.sds3.dsvendas.dto.SaleSumDTO;
import com.sds3.dsvendas.entities.Sale;
import com.sds3.dsvendas.repositories.SaleRepository;
import com.sds3.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    SaleRepository repository;

    @Autowired
    SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return repository.successGroupedBySeller();
    }

}
