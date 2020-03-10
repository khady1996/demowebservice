package teamsClient;

import java.util.List;

public class MonCodeClient {

	public static void main(String[] args) {
		// 1. instanciation du service (généré par wsimport)
		TeamsService monservice = new TeamsService();

		// 2. récupération du client (généré par wsimport)
		Teams port = monservice.getTeamsPort();

		// 3. appel d'une opération du service
		List<Team> mateam = port.getTeams();

		for (int i = 0; i < mateam.size(); i++) {

			System.out.println("Voici l'equipe : " + mateam.get(i).name);
			List<Player> mesjoueurs = mateam.get(i).players;
			for (int j = 0; j < mesjoueurs.size(); j++) {
				System.out.println("Joueur " + (j + 1) + " : " + mesjoueurs.get(j).name);

			}
			System.out.println();
		}

	}

}
