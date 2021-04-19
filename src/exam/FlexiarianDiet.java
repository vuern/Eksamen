package exam;

import java.lang.Exception;

public class FlexiarianDiet extends Diet {
    float maxMeatGramsPerWeek;
    Food preferredMeat;

    //1E
    public boolean isProtein(Food food){
       if(food.type == FoodType.Protein){
           return true;
       }
       else{
           return false;
       }
    }

    public FlexiarianDiet(int daysDuration, String purpose, Food[] allowedFood, float maxMeatGramsPerWeek, Food preferredMeat) throws Exception {
        super(daysDuration, purpose, allowedFood);
        this.maxMeatGramsPerWeek = maxMeatGramsPerWeek;
    // 1D. The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
        if(!isProtein(preferredMeat) || preferredMeat.IsVegan) throw new Exception("not good meat for flexiarian");
        this.preferredMeat = preferredMeat;
    }
}
