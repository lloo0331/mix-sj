package abstracts.animal

import abstracts.food.FoodInScala

/**
  * Created by li on 2017/9/24.
  */
abstract class AnimalInScala {
  type SuitableFood <: FoodInScala
  def eat(food:SuitableFood)
}
