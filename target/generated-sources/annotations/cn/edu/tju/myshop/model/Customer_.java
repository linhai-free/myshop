package cn.edu.tju.myshop.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, Date> birthday;
	public static volatile SingularAttribute<Customer, String> address;
	public static volatile SingularAttribute<Customer, String> gender;
	public static volatile SingularAttribute<Customer, String> question;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SingularAttribute<Customer, String> county;
	public static volatile SingularAttribute<Customer, String> mobile;
	public static volatile SingularAttribute<Customer, String> zipcode;
	public static volatile SingularAttribute<Customer, String> realName;
	public static volatile SingularAttribute<Customer, Integer> score;
	public static volatile ListAttribute<Customer, UserRole> userRoles;
	public static volatile SingularAttribute<Customer, String> password;
	public static volatile SingularAttribute<Customer, String> answer;
	public static volatile SingularAttribute<Customer, String> province;
	public static volatile SingularAttribute<Customer, Rank> rank;
	public static volatile SingularAttribute<Customer, String> email;
	public static volatile SingularAttribute<Customer, String> username;

}

