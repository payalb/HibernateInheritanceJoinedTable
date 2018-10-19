package com.java.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper=true)
@EqualsAndHashCode
@Entity
@PrimaryKeyJoinColumn(name="mgr_id")
public class Manager extends Employee{

	@Column(name="project_budget")
	private float budget;
	private String projectName;
	
	public Manager(String name, int employeeId, String companyName, float budget, String projectName) {
		super(name, employeeId, companyName);
		this.budget= budget;
		this.projectName= projectName;
	}
}
