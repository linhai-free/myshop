package cn.edu.tju.myshop.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, SendMethod> sendMethod;
	public static volatile SingularAttribute<Order, Date> placeTime;
	public static volatile SingularAttribute<Order, BigDecimal> price;
	public static volatile SingularAttribute<Order, String> customerId;
	public static volatile SingularAttribute<Order, String> invoiceItem;
	public static volatile SingularAttribute<Order, OrderStatus> orderStatus;
	public static volatile SingularAttribute<Order, PaymentMethod> paymentMethod;
	public static volatile SingularAttribute<Order, Integer> id;
	public static volatile SingularAttribute<Order, String> invoiceTitle;
	public static volatile ListAttribute<Order, Item> items;
	public static volatile SingularAttribute<Order, Date> sendTime;

}

