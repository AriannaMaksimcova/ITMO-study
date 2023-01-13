package electronics;

import workplaces.TVStudio;

public class Television extends Electronic {
    private TVStudio tvStudio;
    public Television(TVStudio tvStudio){
        super("Телевизор");
        this.tvStudio = tvStudio;
    }
    @Override
    public void turnOn(){
        setTurnedOn(true);
        tvStudio.showPerformance();
    }
}
