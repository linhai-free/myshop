package cn.edu.tju.myshop.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Login.class)
public abstract class Login_ {

	public static volatile SingularAttribute<Login, Date> loginTime;
	public static volatile SingularAttribute<Login, Integer> id;
	public static volatile SingularAttribute<Login, String> ipAddr;
	public static volatile SingularAttribute<Login, String> username;

}

