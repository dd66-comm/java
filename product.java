package shouyingxitong;

public class product {
      private String sno;
      private String name;
      private float price;
      private int number;
      private float totalMoney;
	public product(String sno, String name, float price, int number, float totalMoney) {
		super();
		this.sno = sno;
		this.name = name;
		this.price = price;
		this.number = number;
		this.totalMoney = totalMoney;
	}
	/**
	 * @return the sno
	 */
	public String getSno() {
		return sno;
	}
	/**
	 * @param sno the sno to set
	 */
	public void setSno(String sno) {
		this.sno = sno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	/**
	 * @return the totalMoney
	 */
	public float getTotalMoney() {
		return totalMoney;
	}
	/**
	 * @param totalMoney the totalMoney to set
	 */
	public void setTotalMoney(float totalMoney) {
		this.totalMoney = totalMoney;
	}
	@Override
	public String toString() {
		return  sno + "\t" + name + "\t" + price + "\t" + number + "\t"
				+ totalMoney;
	}
}
