package cn.edu.tju.myshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PaymentMethod.class)
public abstract class PaymentMethod_ {

	public static volatile SingularAttribute<PaymentMethod, String> name;
	public static volatile ListAttribute<PaymentMethod, Order> orders;
	public static volatile SingularAttribute<PaymentMethod, Integer> id;

}

