package cn.edu.tju.myshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserRole.class)
public abstract class UserRole_ {

	public static volatile SingularAttribute<UserRole, String> rolename;
	public static volatile SingularAttribute<UserRole, Integer> id;
	public static volatile SingularAttribute<UserRole, Customer> customer;

}

