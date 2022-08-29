 package com.quocdung.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name="orders")
@EntityListeners(AuditingEntityListener.class)
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="order_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
	
	@Column(nullable = false)
	private boolean status;// xac nhan(1) hay chua xac nhan (0)
	@Column(nullable = false)
	private boolean odertype; // nhan hang tai nha(1) hay den cua hang(0) 
	@Column(nullable = false)
	private boolean pay; //thanh toan(1) hay chua thanh toan(0)
	
	@CreationTimestamp
	private Date createdDate;
	@Column()
	private Date shipDate; // ngay co hang de den nhan hoac giao	
	@Column(nullable = false)
	private float total;
	
	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderDetail> details;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(Integer id, Customer customer, Store store, boolean status, boolean odertype, boolean pay,
			Date createdDate, Date shipDate, float total, Set<OrderDetail> details) {
		super();
		this.id = id;
		this.customer = customer;
		this.store = store;
		this.status = status;
		this.odertype = odertype;
		this.pay = pay;
		this.createdDate = createdDate;
		this.shipDate = shipDate;
		this.total = total;
		this.details = details;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isOdertype() {
		return odertype;
	}

	public void setOdertype(boolean odertype) {
		this.odertype = odertype;
	}

	public boolean isPay() {
		return pay;
	}

	public void setPay(boolean pay) {
		this.pay = pay;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getShipDate() {
		return shipDate;
	}
	
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Set<OrderDetail> getDetails() {
		return details;
	}

	public void setDetails(Set<OrderDetail> details) {
		this.details = details;
	}
	public void addDetails(OrderDetail details) {
		this.details.add(details);
	}


	
	
}
