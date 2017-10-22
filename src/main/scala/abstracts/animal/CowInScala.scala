package abstracts.animal

import abstracts.food.GrassInScala

/**
  * Created by li on 2017/9/24.
  */
class CowInScala extends AnimalInScala{
  override type SuitableFood = GrassInScala
  override def eat(food: GrassInScala){}
}
