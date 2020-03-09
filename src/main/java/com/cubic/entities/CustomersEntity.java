package com.cubic.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomersEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "phone_no")
	private String phoneNo;

	@Column(name = "dob")
	private String dob;

	@Column(name = "zip_code")
	private int zip_code;

	@Column(name = "uuid")
	private String uuid;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "customers_products", joinColumns = @JoinColumn(name = "customers_id"), inverseJoinColumns = @JoinColumn(name = "products_id"))
	private List<ProductsEntity> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public List<ProductsEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductsEntity> products) {
		this.products = products;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	@Override
	public String toString() {
		return "CustomersEntity [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", dob=" + dob + ", zip_code=" + zip_code + ", uuid=" + uuid + ", products=" + products + "]";
	}

}
