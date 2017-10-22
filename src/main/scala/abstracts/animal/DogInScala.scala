package abstracts.animal

import abstracts.food.DogFoodInScala

/**
  * Created by li on 2017/9/24.
  */
class DogInScala extends AnimalInScala{
  override type SuitableFood = DogFoodInScala

  override def eat(food: DogFoodInScala){}
}
