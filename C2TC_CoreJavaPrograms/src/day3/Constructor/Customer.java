package day3.Constructor;

public class Customer {
	
		private int cid;
		private String name;
		private String city;
		
		public Customer()//constructor
		{
			this.cid = 10;
			this.name = "govind";
			this.city = "pune";
		}
		
		//parameterized constructor
		public Customer(int cid, String name, String city)
		{
			this.cid = cid;
			this.name = name;
			this.city = city;
		}
		
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}

		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", city=" + city + "]";
		}
		
		
}
