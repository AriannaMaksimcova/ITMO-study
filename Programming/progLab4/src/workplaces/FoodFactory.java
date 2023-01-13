package workplaces;

import characters.Person;
import interfaces.Advertisement;
import interfaces.Location;

public class FoodFactory extends WorkPlace{
    public static FoodShop FoodShop = new FoodShop("Магазин еды");
    private boolean PrintAdsInNewspapers;
    private static String[] producedFood;

    public FoodFactory(String name, Person boss, Person[] workers, boolean PrintAdsInNewspapers,
                       String[] producedFood){
        super(name, boss, workers);
        this.PrintAdsInNewspapers = PrintAdsInNewspapers;
        this.producedFood = producedFood;
    }
    public boolean isPrintAdsInNewspapers() {
        return PrintAdsInNewspapers;
    }

    public String[] getProducedFood() {
        return producedFood;
    }
    public static class FoodShop implements Location {
        String name;
        String[] goods;

        public boolean usesAdvertisementsOnTheWall;
        public FoodShop(String name){
            this.name = name;
            this.goods = producedFood;
        }
        public Advertisement advertisementsOnTheWall = new Advertisement(){
            public String whatToAdvertise;
            @Override
            public void setWhatToAdvertise(String whatToAdvertise) {
                this.whatToAdvertise = whatToAdvertise;
                FoodFactory.FoodShop.usesAdvertisementsOnTheWall = true;
            }
            @Override
            public String getWhatToAdvertise() {
                return whatToAdvertise;
            }
        };
        public void useAdvertisementsOnTheWall(String whatToAdvertise){
            advertisementsOnTheWall.setWhatToAdvertise(whatToAdvertise);
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
