public class AIPlayer extends Player {

	public AIPlayer(HttpClient restClient, String gameId) {
		this.restClient = restClient;
		this.gameId = gameId;
		this.playerName = "AI";
	}

	/**
	* This method will request the server to use the AI to move a piece
	*/
	public int move() {
		//TODO: ask the server to move a piece with the help of the AI
		
		//Once the reply has been obtained, we need to check if we
		//received a "200 OK"
		//If not, return à -1
		//If it is a "200 OK" but the JSON object contains
		//"error", then return -1

		// in all other cases, return 0 (success code)

		return 0;
	}

}