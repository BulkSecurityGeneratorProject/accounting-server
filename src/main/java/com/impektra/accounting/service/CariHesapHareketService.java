package com.impektra.accounting.service;

import com.impektra.accounting.domain.CariHesapHareket;
import com.impektra.accounting.repository.CariHesapHareketRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class CariHesapHareketService {

    private final Logger log = LoggerFactory.getLogger(CariHesapHareketService.class);

    private final CariHesapHareketRepository cariHesapHareketRepository;

    public CariHesapHareketService(CariHesapHareketRepository cariHesapHareketRepository) {
        this.cariHesapHareketRepository = cariHesapHareketRepository;
    }


    public CariHesapHareket createCariHesapHareket(CariHesapHareket cariHesaphareket) {
        return cariHesapHareketRepository.save(cariHesaphareket);
    }

    public void deleteCariHesapHareket(CariHesapHareket cariHesapHareket) {
        cariHesapHareketRepository.delete(cariHesapHareket);
    }

    @Transactional(readOnly = true)
    public List<CariHesapHareket> getAll() {
        return cariHesapHareketRepository.findAll();
    }


    @Transactional(readOnly = true)
    public Optional<CariHesapHareket> findById(Long id) {
        return cariHesapHareketRepository.findById(id);
    }

    public List<CariHesapHareket> saveAll(List<CariHesapHareket> cariHesapHareketList) {
        return cariHesapHareketRepository.saveAll(cariHesapHareketList);
    }
}
