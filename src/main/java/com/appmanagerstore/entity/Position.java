package com.appmanagerstore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.appmanagerstore.common.AbstractModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POSITION")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position extends AbstractModel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ID_POSITION")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int idPosition;

	@Column(name = "NAME_PROSITION", length = 20)
	private String namePosition;

}
