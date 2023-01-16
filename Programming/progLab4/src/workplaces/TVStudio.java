package workplaces;

import characters.OwnerActionOfTVStudio;
import characters.Person;
import enums.Performance;
import characters.Showman;
import interfaces.Location;
import java.util.Arrays;
import java.util.Objects;

public class TVStudio extends WorkPlace<OwnerActionOfTVStudio, Showman>{
    private OwnerActionOfTVStudio boss;
    private Showman[] workers;
    private static boolean Dunno = false;
    public TVStudio(OwnerActionOfTVStudio boss, Showman[] workers){
        super("ТВ Студия", boss, workers);
        boss.setSalary(1000);
        for (Showman worker : workers) {
            boss.assignSalary(worker, 50);
        }
        this.boss = getBoss();
        this.workers = getWorkers();
    }

    public void showPerformance(){
        Performance performance;
        if (boss.isWasThreatened()){
            boss.toAsk("Почему вы не показываете представление "+ Performance.DUNNO_ON_THE_MOON +
                    "?", workers[0]);
            workers[0].getAngry();
            double needSalary = workers[0].putForwardConditions(workers[1], boss, "Он хочет, чтобы мы показывали " +
                    Performance.DUNNO_ON_THE_MOON + " почти бесплатно!\nОчевидно, " + boss + " принимает нас за " +
                    "слабоумных, в то время как мы вполне в своём уме и за такую ничтожную сумму\nне согласились" +
                    " бы показывать по телевидению не то что пришельца из космоса, но даже простого пуделя");
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
    public void showConference(){
        TVStudio.BigHall bigHall = new TVStudio.BigHall("BigHall", "Космическая конференция",
                new String[]{"Представители газет и журналов", "Математики", "Физики", "Химики", "Астрономы",
                        "Лунологи"}, new String[]{"Незнайка", "Мига", "Козлик", "Жулио"});
        bigHall.whatHappens();
    }
    private class BigHall implements Location {
        String name;
        String conference;
        String[] conferenceParticipants;
        String[] sittingAtTheTable;

        public BigHall(String name, String conference, String[] conferenceParticipants, String[] sittingAtTheTable) {
            this.name = name;
            this.conference = conference;
            this.conferenceParticipants = conferenceParticipants;
            this.sittingAtTheTable = sittingAtTheTable;
        }

        private void whatHappens(){
            System.out.println("В " + name + " происходит " + conference);
            System.out.println("Участники " + conference + ": " + Arrays.toString(conferenceParticipants));
            System.out.println("За столом сидят: " + Arrays.toString(sittingAtTheTable));
            Person dunno = new Person("Незнайка");
            Person conferenceParticipants = new Person("Участники конференции");
            dunno.toSay("Я рассказал собравшимся все, что знал о ракете, на которой был совершен перелет," +
                    " об ее устройстве и управлении.");
            conferenceParticipants.toSay("Теперь мы будем задавать вопросы " + dunno);
        }
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
