package exam;
import org.junit.Assert;
import org.junit.Test;

public class VeganDietTest {

    Food M1 = new Food("Pizza",250,false,FoodType.Fat);
    Food M2 = new Food("Lassagne", 300, false, FoodType.Carb);
    Food M3 = new Food("Kyllingsalat", 100, false, FoodType.Protein);
    Food M4 = new Food("Salat", 50, true, FoodType.Protein);

    @Test
    public void veganDietTest(){
        try{
            Food[] allowedFood = {M1,M2,M3,M4};
            VeganDiet veganDiet = new VeganDiet(7,"I hate meat",allowedFood,100);
        }catch(Exception e){
            Assert.assertTrue(e.getMessage().equals("This aint vegan"));
        }
    }
}
