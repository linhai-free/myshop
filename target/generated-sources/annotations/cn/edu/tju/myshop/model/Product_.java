package cn.edu.tju.myshop.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, String> summary;
	public static volatile SingularAttribute<Product, String> image;
	public static volatile SingularAttribute<Product, BigDecimal> marketPrice;
	public static volatile SingularAttribute<Product, Integer> saleCount;
	public static volatile SingularAttribute<Product, BigDecimal> discount;
	public static volatile SingularAttribute<Product, Date> pubDate;
	public static volatile SingularAttribute<Product, String> name;
	public static volatile SingularAttribute<Product, Integer> id;
	public static volatile SingularAttribute<Product, String> detail;
	public static volatile SingularAttribute<Product, Byte> isOnSale;
	public static volatile SingularAttribute<Product, Category> category;
	public static volatile ListAttribute<Product, Item> items;
	public static volatile SingularAttribute<Product, Integer> stockCount;

}

