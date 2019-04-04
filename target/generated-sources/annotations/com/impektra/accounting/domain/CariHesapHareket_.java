package com.impektra.accounting.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CariHesapHareket.class)
public abstract class CariHesapHareket_ {

	public static volatile SingularAttribute<CariHesapHareket, LocalDate> date;
	public static volatile SingularAttribute<CariHesapHareket, Long> logicalref;
	public static volatile SingularAttribute<CariHesapHareket, BigDecimal> amount;
	public static volatile SingularAttribute<CariHesapHareket, LocalDate> createdDate;
	public static volatile SingularAttribute<CariHesapHareket, BigDecimal> trnet;
	public static volatile SingularAttribute<CariHesapHareket, Integer> createdMin;
	public static volatile SingularAttribute<CariHesapHareket, Long> clientref;
	public static volatile SingularAttribute<CariHesapHareket, Integer> createdSec;
	public static volatile SingularAttribute<CariHesapHareket, Integer> createdHour;
	public static volatile SingularAttribute<CariHesapHareket, Long> paydefref;

}

