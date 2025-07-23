package day2.entity;

public class Customer {
            private int cid;
            private String cname;
			private String city;
	        public Customer()
	        {
	        	this.cid =100;
	        	this.cname= "unknown"
	        }
			public int  getCid() {
				return cid;
			}
			public void setCid(int cid) {
			this.cid = cid;
			}
			public void setName(String name) {
				this.name = cname;
			}
			@Override
			public String toString() {
				return "Customer [cid=" + cid + ", name=" + name + ", getCid()=" + getCid() + ", getClass()="
						+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
            
}
