package com.akash.TEAM_MANAGEMENT;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="player")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="pid")
	int pid;
	@Column(name="name")
	String name;
	@Column(name="jerseynumber")
	int jerseyNumber;
//	@ManyToOne(targetEntity = Team.class, cascade = CascadeType.ALL)
//	Team t;
	
	public Player() {
		super();
	}

	public Player(String name, int jerseyNumber) {
		super();
		this.name = name;
		this.jerseyNumber = jerseyNumber;
//		this.t = t;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", name=" + name + ", jerseyNumber=" + jerseyNumber + "]";
	}
	
}
