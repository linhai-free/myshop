package cn.edu.tju.myshop.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Rank.class)
public abstract class Rank_ {

	public static volatile SingularAttribute<Rank, Integer> score;
	public static volatile SingularAttribute<Rank, String> name;
	public static volatile SingularAttribute<Rank, BigDecimal> discount;
	public static volatile SingularAttribute<Rank, Byte> id;
	public static volatile ListAttribute<Rank, Customer> customers;

}

