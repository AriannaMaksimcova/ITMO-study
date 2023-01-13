package workplaces;

import characters.OwnerOfTVStudio;
import enums.Performance;
import characters.Showman;

import java.util.Arrays;
import java.util.Objects;

public class TVStudio extends WorkPlace<OwnerOfTVStudio, Showman>{
    private static boolean Dunno = false;
    public TVStudio(OwnerOfTVStudio boss, Showman[] workers){
        super("ТВ Студия", boss, workers);
        boss.setSalary(1000);
        for (Showman worker : workers) {
            boss.assignSalary(worker, 50);
        }
    }

    public void showPerformance(){
        Performance performance;
        if (boss.isWasThreatened()){
            boss.toAsk("Почему вы не показываете представление "+ Performance.DUNNO_ON_THE_MOON +
                    "?", workers[0]);
            workers[0].getAngry();
            double needSalary = workers[0].putForwardConditions(workers[1], boss);
            int i = 100;
            boolean isAgreed;
            do{
                boss.toSay("Я предлагаю вам з/п в размере " + i);
                isAgreed = workers[0].isAgreeWithConditions(boss, needSalary, i);
                i += 300;
            } while (!isAgreed);
            boss.agreeWithConditions(workers[0]);
            boss.assignSalary(workers[0], i);
            boss.assignSalary(workers[1], i);
            Dunno = true;
        }
        if (!Dunno){
            performance = Performance.randomPerformance();
        } else{
            performance = Performance.DUNNO_ON_THE_MOON;
        }
        System.out.println("В эфире: " + performance + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TVStudio tvStudio = (TVStudio) o;
        return Objects.equals(boss, tvStudio.boss) && Arrays.equals(workers, tvStudio.workers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), boss);
        result = 31 * result + Arrays.hashCode(workers);
        return result;
    }
}
