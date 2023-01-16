package workplaces;

import characters.Person;
import interfaces.Advertised;
import interfaces.Location;

public class FoodFactory extends WorkPlace{
    public static FoodShop FoodShop = new FoodShop("Магазин еды");
    private boolean isPrintAdsInNewspapers;
    private static String[] producedFood;

    public FoodFactory(String name, Person boss, Person[] workers, boolean isPrintAdsInNewspapers,
                       String[] producedFood){
        super(name, boss, workers);
        this.isPrintAdsInNewspapers = isPrintAdsInNewspapers;
        this.producedFood = producedFood;
    }
    public boolean isPrintAdsInNewspapers() {
        return isPrintAdsInNewspapers;
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
        public Advertised advertisementsOnTheWall = new Advertised(){
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
