package io.turntabl.scalagettingstarted

object MyApp extends App {
   val returnTheLenghtOfAString= (stringWord: String)=> stringWord.length
//    returnTheLenghtOfAString("prod")

//  printing spaces in a string
val spacesInString = (word: String) => word.count(_ ==' ')
//spacesInString("he llo")

//  function that accept Int and Return a String
  val ApplyToString = (s:String, f:(String => Int)) => f(s)
//  spacesInString("he llo")
//  returnTheLenghtOfAString("hello")

//  simple calc
val calculate = (instruction: String) => (num1:Int, num2: Int)=> instruction match {
  case "add" => num1 + num2
  case "sub" => num1 - num2
  case "mult" => num1 * num2
  case "div" => num1 / num2
}
//  adding
//  val instWord= calculate("sub")
// print( instWord(4,6))

//subtration
//  val instWord1= calculate("add")
//  print( instWord1(4,6))

//  multiply
//  val instword = calculate("mult")
//  print(instword(4,6))

//  divide
  val instword = calculate("div")
  print(instword(6,6))
}
