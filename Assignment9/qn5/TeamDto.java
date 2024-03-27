package Assignment9.qn5;

import java.util.List;

public class TeamDto {
	public String name;
	public String city;
	public String division;
	public List<PlayersDto> players;

	public void playGame() {
		System.out.println("team is playing");
	}

	public void hireCoach() {
		System.out.println("Team hirecoach is present");
	}

}
