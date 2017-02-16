package cn.edu.tju.myshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderStatus.class)
public abstract class OrderStatus_ {

	public static volatile SingularAttribute<OrderStatus, String> name;
	public static volatile ListAttribute<OrderStatus, Order> orders;
	public static volatile SingularAttribute<OrderStatus, Integer> id;

}

