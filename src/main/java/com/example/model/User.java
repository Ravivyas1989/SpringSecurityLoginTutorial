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

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Transient;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "email")
	@Email(message = "*Please provide a valid Email")
	@NotEmpty(message = "*Please provide an email")
	private String email;

	@Column(name = "password")
	@Length(min = 5, message = "*Your password must have at least 5 characters")
	@NotEmpty(message = "*Please provide your password")
	@Transient
	private String password;

	@Column(name = "name")
	@NotEmpty(message = "*Please provide your name")
	private String name;

	@Column(name = "last_name")
	@NotEmpty(message = "*Please provide your last name")
	private String lastName;

	@Column(name = "active")
	private int active;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles;

	public int getId() {
		// System.out.println("getId() in User called and id is " + id);
		return id;
	}

	public void setId(int id) {
		// System.out.println("setId(int id) in User called and id is " + id);
		this.id = id;
	}

	public String getPassword() {
		// System.out.println("getPassword() in User called and password is " +
		// password);
		return password;
	}

	public void setPassword(String password) {
		// System.out.println("setPassword(String password) in User called and password
		// is " + password);
		this.password = password;
	}

	public String getName() {
		// System.out.println("getName() in User called and name is " + name);
		return name;
	}

	public void setName(String name) {
		// System.out.println("setName(String name) in User called and name is " +
		// name);
		this.name = name;
	}

	public String getLastName() {
		// System.out.println("getLastName() in User called and lastname is " +
		// lastName);
		return lastName;
	}

	public void setLastName(String lastName) {
		// System.out.println("setLastName(String lastName) in User called and lastname
		// is " + lastName);
		this.lastName = lastName;
	}

	public String getEmail() {
		// System.out.println(" getEmail() in User called and email is " + email);
		return email;
	}

	public void setEmail(String email) {
		// System.out.println("setEmail(String email) in User called and email is " +
		// email);
		this.email = email;
	}

	public int getActive() {
		// System.out.println("int getActive() in User called and active is " + active);
		return active;
	}

	public void setActive(int active) {
		// System.out.println("setActive(int active) in User called and active is " +
		// active);
		this.active = active;
	}

	public Set<Role> getRoles() {
		for (Role role : roles) {
			System.out.println("Set<Role> getRoles() in User called and roles is " + roles);
		}
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		for (Role role : roles) {
			System.out.println("setRoles(Set<Role> roles in User called and roles is " + roles);
		}
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", lastName="
				+ lastName + ", active=" + active + ", roles=" + roles + "]";
	}

}
