package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_info")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stud_id; // field

	@Column(name = "first_name")
	    private String f_name;
	
	@Column(name = "last_name")
	    private String l_name;
	    private int DOB;
	    private String gender;
	    private String address;
	    
	    
	    public Student() {
	    	
	    }


		public Student(int stud_id, String f_name, String l_name, int dOB, String gender, String address) {
			super();
			this.stud_id = stud_id;
			this.f_name = f_name;
			this.l_name = l_name;
			DOB = dOB;
			this.gender = gender;
			this.address = address;
		}


		public int getStud_id() {
			return stud_id;
		}


		public void setStud_id(int stud_id) {
			this.stud_id = stud_id;
		}


		public String getF_name() {
			return f_name;
		}


		public void setF_name(String f_name) {
			this.f_name = f_name;
		}


		public String getL_name() {
			return l_name;
		}


		public void setL_name(String l_name) {
			this.l_name = l_name;
		}


		public int getDOB() {
			return DOB;
		}


		public void setDOB(int dOB) {
			DOB = dOB;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		@Override
		public String toString() {
			return "Student [stud_id=" + stud_id + ", f_name=" + f_name + ", l_name=" + l_name + ", DOB=" + DOB
					+ ", gender=" + gender + ", address=" + address + "]";
		}
	    
}
