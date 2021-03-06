package com.itea.task1

/**
 * @see http://aperiodic.net/phil/scala/s-99/
 */
object Application1 extends App {

  /**
   * @see http://aperiodic.net/phil/scala/s-99/p01.scala
   *      P01 (*) Находим последний элемент списка.
   */
  // P01 (*) Find the last element of a list.

  val list: List[Int] = List(1, 1, 2, 3, 5, 8)
//  println( list )

  println( "list.last = " + list.last ) // 8

  def last(list: List[Int], lastIndex: Int => Int): Int = {
    val index = lastIndex( list.length )
    list( index )
  }
  println( last(list, i => i-1) ) // 8

  def lastRecursive[T](ls: List[T]): T = ls match {
    case h :: Nil => h              //TODO: [здесь инфиксная операция для работы со списком типа 'val l = 1 :: 2 :: 3 :: Nil'] а в случае когда дошли до крайнего элемента 'Nil', тогда в этом случае возвращаем его предшественника
    case _ :: t => lastRecursive(t) //TODO: [здесь инфиксная операция для работы со списком типа 'val l = 1 :: 2 :: 3 :: Nil'] в case получаем какой то список '_'  дальше вызываем метод next '::' следующий элемент списка...  sound because `next` is used only locally
  }

  // нижнее подчеркивание после 'case' (pattern matching) говорит о том что значение будет игнорироваться
  // но если указать название переменной. в таком случае оно будет вытянуто из левой части (перед '=>') и передано в правую часть (после '=>')

  println( "lastRecursive = " + lastRecursive(list) )

}


