package exercice2.Composite;

import exercice2.Component.Mission;
import exercice2.Leaf.Trajet;

import java.util.ArrayList;
import java.util.List;

public class SousMission implements Mission {

    List<Mission> missionList=new ArrayList<Mission>();

    @Override
    public float cout() {
        float cout_total=0;
        for(Mission mission:missionList){
            mission.showMissionDetails();

            cout_total+=mission.cout();
        }
        return cout_total;
    }


    public void showMissionDetails(){
        for (Mission mission:missionList){
            mission.showMissionDetails();
        }
    }

    public void addTrajet(Trajet trajet) {
        missionList.add(trajet);
    }

    public void removeTrajet(Trajet trajet) {
        missionList.remove(trajet);
    }
}
