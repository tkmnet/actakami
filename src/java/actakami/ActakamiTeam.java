package actakami;

import comlib.adk.team.Team;
import comlib.adk.team.tactics.AmbulanceTeamTactics;
import comlib.adk.team.tactics.FireBrigadeTactics;
import comlib.adk.team.tactics.PoliceForceTactics;
import rescuecore2.config.Config;

public class ActakamiTeam extends Team {

    @Override
    public String getTeamName() {
        return "actakami";
    }

    @Override
    public FireBrigadeTactics getFireBrigadeTactics() {
        return new ActakamiFire();
    }

    @Override
    public AmbulanceTeamTactics getAmbulanceTeamTactics() {
        return new ActakamiAmbulance();
    }

    @Override
    public PoliceForceTactics getPoliceForceTactics() {
        return new ActakamiPolice();
    }
}
