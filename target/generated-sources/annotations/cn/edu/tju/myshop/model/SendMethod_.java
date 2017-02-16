package cn.edu.tju.myshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SendMethod.class)
public abstract class SendMethod_ {

	public static volatile SingularAttribute<SendMethod, String> name;
	public static volatile ListAttribute<SendMethod, Order> orders;
	public static volatile SingularAttribute<SendMethod, Integer> id;

}

