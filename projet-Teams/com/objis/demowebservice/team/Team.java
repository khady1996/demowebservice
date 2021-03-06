package com.objis.demowebservice.team;

import java.util.List;

public class Team {
	private List<Player> players;
	private String name;

	public Team() {
	}

	public Team(String name, List<Player> players) {
		this.setName(name);
		this.setPlayers(players);
	}

	public String getName() {
		return name;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public int getRosterCount() {
		return players == null ? 0 : players.size();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void setRosterCount(int n) {
	} // no-op but needed for property

	@Override
	public String toString() {

		return "Team [players=" + players + ", name=" + name + "]";
	}

}
