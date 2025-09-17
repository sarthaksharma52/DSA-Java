// class FoodRatings {

//     private Map<String,String> foodsToCuisines;
//     private Map<String,Integer> foodsToRatings;
//     private Map<String,List<String>> cuisinesToFoods;

//     public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        
//         foodsToCuisines = new HashMap<>();
//         foodsToRatings = new HashMap<>();
//         cuisinesToFoods = new HashMap<>();

//         for(int i=0;i<foods.length;i++){
//             foodsToCuisines.put(foods[i],cuisines[i]);
//             foodsToRatings.put(foods[i],ratings[i]);
//             cuisinesToFoods.computeIfAbsent(cuisines[i],k->new ArrayList<>()).add(foods[i]);
//         }

        
//     }
    
//     public void changeRating(String food, int newRating) {
//         foodsToRatings.put(food,newRating);
//     }
    
//     public String highestRated(String cuisine) {
//         List<String> foods = cuisinesToFoods.get(cuisine);

//         String bestFood = "";
//         int bestRating = -1;

//         for(String food : foods){
//             int rating = foodsToRatings.get(food);
//             if(rating > bestRating || (rating == bestRating && food.compareTo(bestFood)<0)){
//                 bestFood = food;
//                 bestRating = rating;
//             }
//         }
//         return bestFood;
//     }
// }

// /**
//  * Your FoodRatings object will be instantiated and called as such:
//  * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
//  * obj.changeRating(food,newRating);
//  * String param_2 = obj.highestRated(cuisine);
//  */


import java.util.*;

class FoodRatings {

    class Food {
        String name;
        int rating;

        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }

    private Map<String, String> foodToCuisine;
    private Map<String, Food> foodMap;
    private Map<String, TreeSet<Food>> cuisineToFoods;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodMap = new HashMap<>();
        cuisineToFoods = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            Food f = new Food(food, rating);
            foodToCuisine.put(food, cuisine);
            foodMap.put(food, f);

            cuisineToFoods
                .computeIfAbsent(cuisine, k -> new TreeSet<>(
                    (a, b) -> {
                        if (a.rating != b.rating) {
                            return b.rating - a.rating;
                        }
                        return a.name.compareTo(b.name); 
                    }
                ))
                .add(f);
        }
    }

    public void changeRating(String food, int newRating) {
        Food f = foodMap.get(food);
        String cuisine = foodToCuisine.get(food);

        cuisineToFoods.get(cuisine).remove(f);

        f.rating = newRating;

        cuisineToFoods.get(cuisine).add(f);
    }

    public String highestRated(String cuisine) {
        return cuisineToFoods.get(cuisine).first().name;
    }
}