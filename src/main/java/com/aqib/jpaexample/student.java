package com.aqib.jpaexample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id		
private int s_id;
private int s_age;
private String s_class,s_email,s_favourite_subject,s_gender,s_name;
public student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "student [s_id=" + s_id + ", s_age=" + s_age + ", s_class=" + s_class + ", s_email=" + s_email
			+ ", s_favourite_subject=" + s_favourite_subject + ", s_gender=" + s_gender + ", s_name=" + s_name + "]";
}
public student(int s_age, String s_class, String s_email, String s_favourite_subject, String s_gender, String s_name) {
	super();
	this.s_age = s_age;
	this.s_class = s_class;
	this.s_email = s_email;
	this.s_favourite_subject = s_favourite_subject;
	this.s_gender = s_gender;
	this.s_name = s_name;
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public int getS_age() {
	return s_age;
}
public void setS_age(int s_age) {
	this.s_age = s_age;
}
public String getS_class() {
	return s_class;
}
public void setS_class(String s_class) {
	this.s_class = s_class;
}
public String getS_email() {
	return s_email;
}
public void setS_email(String s_email) {
	this.s_email = s_email;
}
public String getS_favourite_subject() {
	return s_favourite_subject;
}
public void setS_favourite_subject(String s_favourite_subject) {
	this.s_favourite_subject = s_favourite_subject;
}
public String getS_gender() {
	return s_gender;
}
public void setS_gender(String s_gender) {
	this.s_gender = s_gender;
}
public String getS_name() {
	return s_name;
}
public void setS_name(String s_name) {
	this.s_name = s_name;
}

}
