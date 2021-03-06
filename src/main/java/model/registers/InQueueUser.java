package model.registers;

import org.joda.time.base.BaseDuration;

import model.ProductList;
import model.Profile;
import model.User;

public class InQueueUser {

	private ProductList productList;
	private User user;

	public InQueueUser(ProductList aProductList, User anUser) {
		this.setProductList(aProductList);
		this.setUser(anUser);
	}

	public BaseDuration getProcessingTime() {
		return this.getProductList().getProcessingTime();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ProductList getProductList() {
		return productList;
	}

	public void setProductList(ProductList productList) {
		this.productList = productList;
	}

	public Profile getProfile() {
		return this.getUser().getProfile();
	}

}
