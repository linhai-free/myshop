package cn.edu.tju.myshop.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(County.class)
public abstract class County_ {

	public static volatile SingularAttribute<County, City> city;
	public static volatile SingularAttribute<County, String> countyId;
	public static volatile SingularAttribute<County, String> name;

}

