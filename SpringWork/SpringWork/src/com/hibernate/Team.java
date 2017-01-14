package com.hibernate;

import java.util.Set;

public class Team {

	int teamId;
	String teamName;
	Set<Player> p;
	
	
	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}


	public String getTeamName() {
		return teamName;
	}


	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	public Set<Player> getP() {
		return p;
	}


	public void setP(Set<Player> p) {
		this.p = p;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
