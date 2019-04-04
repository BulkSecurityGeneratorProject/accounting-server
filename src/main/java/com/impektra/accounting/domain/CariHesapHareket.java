package com.impektra.accounting.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@Entity
@Table(name = "cari_hesap_hareket")
public class CariHesapHareket implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty("LOGICALREF")
    private Long logicalref;

    @JsonProperty("CLIENTREF")
    private Long clientref;

    @JsonProperty("PAYDEFREF")
    private Long paydefref;

    @JsonProperty("AMOUNT")
    private BigDecimal amount;

    @JsonProperty("DATE_")
    private LocalDate date;

    @JsonProperty("TRNET")
    private BigDecimal trnet;

    @JsonProperty("CAPIBLOCK_CREADEDDATE")
    private LocalDate createdDate;

    @JsonProperty("CAPIBLOCK_CREATEDHOUR")
    private Integer createdHour;

    @JsonProperty("CAPIBLOCK_CREATEDMIN")
    private Integer createdMin;

    @JsonProperty("CAPIBLOCK_CREATEDSEC")
    private Integer createdSec;

}
