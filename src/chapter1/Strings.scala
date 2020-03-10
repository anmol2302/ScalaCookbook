package chapter1

object Strings {
  def main(args:Array[String]){
    println("Welcome to chapter1 Strings");
    var result= filterString("welcome")
    print("the result after filteration"+result)
  }




  def filterString(word:String):String={
    return word.filter(_!='o')
  }
}
