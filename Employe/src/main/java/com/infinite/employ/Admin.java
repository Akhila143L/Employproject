package com.infinite.employ;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
	@ManagedBean
    @SessionScoped
	@Entity
	@Table(name="adminn")
	public class Admin {
		
		@Id
		@Column(name="employId")
        private int employId;
		
		@Column(name="email")
		private String email ;
		
		@Column(name="password")
		private String password ;

		public int getEmployId() {
			return employId;
		}

		public void setEmployId(int employId) {
			this.employId = employId;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Admin [employId=" + employId + ", email=" + email + ", password=" + password + "]";
		}

		public Admin(int employId, String email, String password) {
			super();
			this.employId = employId;
			this.email = email;
			this.password = password;
		}

		public Admin() {
		}
		
		

}
	
