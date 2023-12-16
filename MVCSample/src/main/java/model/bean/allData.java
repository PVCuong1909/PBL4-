package model.bean;

public class allData {
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
	
	public allData(int id, String title, String posting_date, String deadline, String company, String salary, String yoe, String tpye, String level, String education, String sex, String career, String age, String id_job, String contact_with, String location, String note, String phone_number, String language, String describe_job, String benefits, String skills) {
		super();
		this.id = id;
		this.title = title;
		this.company = company;
		this.posting_date = posting_date;
		this.deadline = deadline;
		this.salary = salary;
		this.yoe = yoe;
		this.tpye = tpye;
		this.level = level;
		this.education = education;
		this.sex = sex;
		this.career = career;
		this.age = age;
		this.id_job = id_job;
		this.contact_with = contact_with;
		this.location = location;
		this.note = note;
		this.phone_number = phone_number;
		this.language = language;
		this.describe_job = describe_job;
		this.benefits = benefits;
		this.skills = skills;
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
	
	public String getPosting_date() {
		return posting_date;
	}

	public String getDeadline() {
		return deadline;
	}

	public String getYoe() {
		return yoe;
	}
	
	public String getTpye() {
		return tpye;
	}

	public String getLevel() {
		return level;
	}

	public String getEducation() {
		return education;
	}
	
	public String getSex() {
		return sex;
	}

	public String getCareer() {
		return career;
	}

	public String getAge() {
		return age;
	}
	
	public String getID_job() {
		return id_job;
	}

	public String getContact_with() {
		return contact_with;
	}

	public String getLocation() {
		return location;
	}
	
	public String getNote() {
		return note;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public String getLanguage() {
		return language;
	}
	
	public String getdDscribe_job() {
		return describe_job;
	}

	public String getBenefits() {
		return benefits;
	}

	public String getSkills() {
		return skills;
	}

}
