package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private int role_id;

	@Column(name = "role")
	@NotEmpty(message = "*Please provide your role")
	private String roles;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;

	public int getId() {
		System.out.println("getId() called in Role and id is " + role_id);
		return role_id;
	}

	public void setId(int role_id) {
		System.out.println("setId(int id) called in Role and id is " + role_id);
		this.role_id = role_id;
	}

	public String getRoles() {
		System.out.println("getRole() called in Role and role is " + roles);
		return roles;
	}

	public void setRoles(String role) {
		System.out.println("setRole(String role) called in Role and role is " + role);
		this.roles = role;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role=" + roles + "]";
	}

}
