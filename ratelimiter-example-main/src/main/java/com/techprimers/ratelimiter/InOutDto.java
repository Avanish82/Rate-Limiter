package com.techprimers.ratelimiter;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
//@NamedStoredProcedureQuery(name= "APPS.EXL_SUPPER_APP_PKG.EXL_SUPPER_APP_PRC", procedureName = "APPS.EXL_SUPPER_APP_PKG.EXL_SUPPER_APP_PRC", parameters = {
//@NamedStoredProcedureQuery(name= "avanish", procedureName = "[dbo].[UAT_ResponsceIDLIKEOUTPUT]", parameters = {	
//      @StoredProcedureParameter(mode = ParameterMode.IN, name = "UID", type = Integer.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "NAME", type = String.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "ADDRESS", type = String.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "STATUS", type = String.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "PHONE", type = String.class),
//		@StoredProcedureParameter(mode = ParameterMode.IN, name = "CREATEDON", type = String.class),
//		 
//})
@Table(name = "procedureTestinTable")
public class InOutDto {
//	
//	  @UID INT  
//	   @NAME  
//	    @ADDRESS  
//	    @STATUS  
//	    @PHONE  
//		@CREATEDON  
		
		@Id
//		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "uid")
		public Long uid;
		
		@Column(name = "Name")
		public String Name;
		
		@Column(name = "Address")
		public String Address;
		
		@Column(name = "Status")
		public String Status;
		
		@Column(name = "Phone")
		public String Phone;
		
		@Column(name = "Createdon")
		public String Createdon;

		 

		public Long getUid() {
			return uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public String getStatus() {
			return Status;
		}

		public void setStatus(String status) {
			Status = status;
		}

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}

		public String getCreatedon() {
			return Createdon;
		}

		public void setCreatedon(String createdon) {
			Createdon = createdon;
		}

		 

		 
		 

}
