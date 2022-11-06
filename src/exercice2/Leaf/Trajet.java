package exercice2.Leaf;

import exercice2.Component.Mission;

import java.util.Date;

public class Trajet implements Mission {
    private String Pt_Depart;
    private String Pt_Arrive;
    private String Date_Depart;
    private String Date_arrive;
    private float cout;

    public Trajet(TrajetBuilder trajetBuilder) {
        Pt_Depart = trajetBuilder.Pt_Depart;
        Pt_Arrive = trajetBuilder.Pt_Arrive;
        Date_Depart = trajetBuilder.Date_Depart;
        Date_arrive = trajetBuilder.Date_arrive;
        this.cout = trajetBuilder.cout;
    }

    @Override
    public float cout() {
        return cout;
    }

    public void showMissionDetails() {
        System.out.println("Details: " +
                "Point de Depart='" + Pt_Depart + '\'' +
                ", Point d'Arrive='" + Pt_Arrive + '\'' +
                ", Date de Depart='" + Date_Depart + '\'' +
                ", Date d'arrive='" + Date_arrive + '\'' +
                ", cout=" + cout
                );
    }

    public static class TrajetBuilder{
        private String Pt_Depart;
        private String Pt_Arrive;
        private String Date_Depart;
        private String Date_arrive;
        private float cout;

        public TrajetBuilder withPtDepart(String Pt_Depart){
            this.Pt_Depart=Pt_Depart;
            return this;
        }

        public TrajetBuilder withPtArrive(String Pt_Arrive){
            this.Pt_Arrive=Pt_Arrive;
            return this;
        }

        public TrajetBuilder withDate_Depart(String Date_Depart){
            this.Date_Depart=Date_Depart;
            return this;
        }
        public TrajetBuilder withDate_arrive(String Date_arrive){
            this.Date_arrive=Date_arrive;
            return this;
        }

        public TrajetBuilder withcout(float cout){
            this.cout=cout;
            return this;
        }
        public Trajet build(){
            Trajet trajet=new Trajet(this);
            return trajet;
        }

    }
}
