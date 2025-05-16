package com.akash.TEAM_MANAGEMENT;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="team")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="tid")
	int tid;
	@Column(name="name")
	String name;
	@OneToMany(targetEntity = Player.class, cascade = CascadeType.ALL)
	List<Player> players;
	
	public Team() {
		super();
	}

	public Team(String name, List<Player> players) {
		super();
		this.name = name;
		this.players = players;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", name=" + name + ", players=" + players + "]";
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
}
