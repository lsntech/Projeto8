public class JavaFactoryPattern {


    interface Food {
        public String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    static class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }


   static class FoodFactory {

        public Food getFood(String order) {

            switch (order.toLowerCase()) {
                case "pizza":
                    return new Pizza();
                case "cake":
                    return new Cake();

            }

            return null;

        }
    }



    public static void main(String[] args) {



        FoodFactory p = new FoodFactory();
        Food food = p.getFood("pizza");
        System.out.println(food.getType());





    }


}
