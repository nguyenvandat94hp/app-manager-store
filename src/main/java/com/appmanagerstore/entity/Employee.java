package com.appmanagerstore.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.appmanagerstore.common.AbstractModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMPLOYEE")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends AbstractModel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_EMPLOYEE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEmployee;

	@Column(name = "NAME", length = 30)
	private String name;

	@Column(name = "ADDRESS", length = 100)
	private String address;

	@Column(name = "GENDER")
	private boolean gender;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_POSITION")
	private Position position;

}
