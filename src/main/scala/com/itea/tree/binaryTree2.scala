//package com.itea.tree
//
//import scala.{None => SNone}
//import scala.{Option => SOption}
//
//trait BinaryTree2
//case class Leaf2(v: Int) extends BinaryTree2 {
////  override def toString: String = s"v=$v" // Branch(2,Branch(4,v=0,v=0),Branch(5,v=0,v=0))
//override def toString: String = ""
//}
//case class Branch2(v: Int, var left: BinaryTree2, var right: BinaryTree2) extends BinaryTree2 {
////  override def toString: String = s"$left $right"
//}
//
//object BinaryTreeApp extends App {
//
//  val branch = Branch2(v = 1,
//    left = Branch2(v=2,
//      left = Branch2(v=4, left=Leaf2(0), right=Leaf2(0)),
//      right = Branch2(v=5, left=Leaf2(0), right=Leaf2(0))
//    ),
//    right = Branch2(v=3,
//      left = Branch2(v=6,
//        left = Branch2(v=8, left=Leaf2(0), right=Leaf2(0)),
//        right = Leaf2(0)
//      ),
//      right = Branch2(v=7,
//        left = Leaf2(0),
//        right = Branch2(v=9, left=Leaf2(0), right=Leaf2(0))
//      )
//    )
//  )
//
//  println( branch )       // Branch(1,Branch(2,Branch(4,Leaf2(0),Leaf2(0)),Branch(5,Leaf2(0),Leaf2(0))),Branch(3,Branch(6,Branch(8,Leaf2(0),Leaf2(0)),Leaf2(0)),Branch(7,Leaf2(0),Branch(9,Leaf2(0),Leaf2(0)))))
//  println( branch.left )  // Branch(2,Branch(4,Leaf2(0),Leaf2(0)),Branch(5,Leaf2(0),Leaf2(0)))
//  println( branch.right ) // Branch(3,Branch(6,Branch(8,Leaf2(0),Leaf2(0)),Leaf2(0)),Branch(7,Leaf2(0),Branch(9,Leaf2(0),Leaf2(0))))
//
//  def traversalTree(branch: BinaryTree2): BinaryTree2 = branch match {
//    case Branch2(_, left, _) => left
//    case Branch2(_, _, right) => right
//    case _ => {
//      println( branch )
//      branch
//    }
//  }
//
////  def traversalTree(branch: BinaryTree2): BinaryTree2 = branch match {
////    case b @ Branch(_,left,right) if (b.left) => left
////    case Leaf2(v) => {
////      println( v )
////      branch
////    }
////    case _ => {
////      println( branch )
////      branch
////    }
////  }
//
//  println( traversalTree(branch) )
//
//}
