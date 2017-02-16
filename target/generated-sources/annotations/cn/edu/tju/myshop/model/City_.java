package cn.edu.tju.myshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(City.class)
public abstract class City_ {

	public static volatile SingularAttribute<City, Province> province;
	public static volatile SingularAttribute<City, String> name;
	public static volatile SingularAttribute<City, String> cityId;
	public static volatile ListAttribute<City, County> counties;

}

