package libraries.refined

object RefinedTrial extends App {

  import eu.timepit.refined._
  import eu.timepit.refined.auto._
  import eu.timepit.refined.boolean._
  import eu.timepit.refined.numeric._

  type ZeroToOne = Not[Less[W.`0.0`.T]] And Not[Greater[W.`1.0`.T]]
  val limitedDouble = refineMV[ZeroToOne](0.1)
  println(limitedDouble)
  // 0.1
  println(limitedDouble.value)


  // a byte 2^8
  type PositiveByte = Not[Less[W.`0`.T]] And Not[Greater[W.`255`.T]]
  val positiveByte = refineMV[PositiveByte](0)

  println(positiveByte)
  // 0
  println(positiveByte.value)

  //  val positiveByteOver = refineMV[PositiveByte](311)
  //  println(positiveByteOver)
  //  println(positiveByteOver.value)
  //  Error:(25, 48) Right predicate of (!(311 < 0) && !(311 > 255)) failed: Predicate (311 > 255) did not fail.
  //  val positiveByteOver = refineMV[PositiveByte](311)

//  val negative =  refineMV[PositiveByte](positiveByte - 1)
  // Error:(25, 41) compile-time refinement only works with literals
  //  val negative =  refineMV[PositiveByte](positiveByte - 1)



}
