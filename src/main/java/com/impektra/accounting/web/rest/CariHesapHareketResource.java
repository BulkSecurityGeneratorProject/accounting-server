package com.impektra.accounting.web.rest;

import com.impektra.accounting.domain.CariHesapHareket;
import com.impektra.accounting.service.CariHesapHareketService;
import com.impektra.accounting.web.rest.util.HeaderUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/cariHesapHareket")
public class CariHesapHareketResource {

    private final Logger log = LoggerFactory.getLogger(CariHesapHareketResource.class);

    private final CariHesapHareketService cariHesapHareketService;

    public CariHesapHareketResource(CariHesapHareketService cariHesapHareketService) {
        this.cariHesapHareketService = cariHesapHareketService;
    }

    @PostMapping()
    public ResponseEntity<CariHesapHareket> create(@Valid @RequestBody CariHesapHareket cariHesapHareket) throws URISyntaxException {
        log.debug("REST request to save CariHesapHareket : {}", cariHesapHareket);

        CariHesapHareket response = cariHesapHareketService.createCariHesapHareket(cariHesapHareket);
        return ResponseEntity.created(new URI("/api/users/" + "dsd"))
                .headers(HeaderUtil.createAlert("userManagement.created", "name"))
                .body(response);

    }

    @PostMapping("all")
    public ResponseEntity<List<CariHesapHareket>> create(@RequestBody List<CariHesapHareket> cariHesapHareketList) throws URISyntaxException {
        log.debug("REST request to save CariHesapHareket : {}", cariHesapHareketList);
        List<CariHesapHareket> cariHesapHareketResponse = cariHesapHareketService.saveAll(cariHesapHareketList);
        return ResponseEntity.created(new URI("/api/cariHesapHareket/all" + "ssss"))
                .headers(HeaderUtil.createAlert("userManagement.created", "name"))
                .body(cariHesapHareketResponse);

    }

    @GetMapping()
    public List<CariHesapHareket> getAll() {
        return cariHesapHareketService.getAll();
    }

}
