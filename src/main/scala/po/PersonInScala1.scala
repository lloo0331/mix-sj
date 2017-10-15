package po

import utils.PlUtils

//上界,排序
class PersonInScala1 (val firstName:String,val lastName:String)extends Ordered[PersonInScala1] with Serializable{

  override def compare(that: PersonInScala1) ={
    val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
    if(lastNameComparison!=0)
      lastNameComparison
    else{
      firstName.compareToIgnoreCase(that.firstName)
    }
  }

  override def toString: String = firstName +" "+lastName



}

object TestPerson1{

  def main(args: Array[String]): Unit = {

    val robert = new PersonInScala1("Rebert","Jones")

    val sally = new PersonInScala1("Sally","Smith")

    PlUtils.pri(robert<sally)

    val people = List(new PersonInScala1("Larry","Wall"),
      new PersonInScala1("Anders","Hejlsberg"),
      new PersonInScala1("Guido","van Rossum"),
      new PersonInScala1("Alan","Kay"),
      new PersonInScala1("Yukihiro","Matsumoto")
    )

    val sortedPeople = orderedMergeSort(people)

    PlUtils.pri(sortedPeople)

    //val wontCompile = orderedMergeSort(List(3,2,1))


  }

  //排序..目前还没看懂
  def orderedMergeSort[T <: Ordered[T]](xs:List[T]):List[T] = {
    def merge(xs:List[T],ys:List[T]):List[T]=
      (xs,ys) match {
        case (Nil,_) =>ys
        case (_,Nil) =>xs
        case (x::xs1,y::ys1)=>
          if(x<y) x :: merge(xs1,ys)
          else y :: merge(xs,ys1)
      }
    val n = xs.length/2
    if(n==0)xs
    else{
      val(ys,zs) = xs splitAt n
      merge(orderedMergeSort(ys),orderedMergeSort(zs))
    }
  }

}
