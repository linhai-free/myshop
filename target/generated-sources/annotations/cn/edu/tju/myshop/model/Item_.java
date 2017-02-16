package cn.edu.tju.myshop.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Item.class)
public abstract class Item_ {

	public static volatile SingularAttribute<Item, Product> product;
	public static volatile SingularAttribute<Item, BigDecimal> price;
	public static volatile SingularAttribute<Item, Integer> count;
	public static volatile SingularAttribute<Item, Integer> id;
	public static volatile SingularAttribute<Item, Order> order;

}

