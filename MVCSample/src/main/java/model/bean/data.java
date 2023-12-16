package model.bean;

public class data {
	private int id;
	private String title;
	private String company;
	private String posting_date;
	private String deadline;
	private String salary;
	private String yoe;
	private String tpye;
	private String level;
	private String education;
	private String sex;
	private String career;
	private String age;
	private String id_job;
	private String contact_with;
	private String location;
	private String note;
	private String phone_number;
	private String language;
	private String describe_job;
	private String benefits;
	private String skills;
	
	public data(int id, String title, String company, String salary) {
		super();
		this.id = id;
		this.title = title;
		this.company = company;
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getSalary() {
		return salary;
	}
	
	public void setSalary(String salary) {
		this.salary = salary;
	}
}

