package dwango_text

/**
  Future and Promise Practice
  */

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Success, Random}

import java.util.concurrent.atomic.AtomicInteger

object CountDownLatch {
  val random = new Random()
  val waitMaxMilliSec = 1000
  val maxFuture = 8
  val countFuture = 3

  val indexHolder = new AtomicInteger(0) // 解答例より。プリミティブな値に関して原子的な操作を提供する

  def waitRandom(futureNum: Int): Int = {
    val waitMillSec = random.nextInt(waitMaxMilliSec)
    Thread.sleep(waitMillSec)
    waitMillSec
  }

  def countDownFuture : Vector[Future[Int]] = {
    (for (i <- 1 to maxFuture) yield {
      Future { waitRandom(i) }
    }).toVector
  }

  def main(args: Array[String]) {

    val countDownPromise = for (i <- 1 to countFuture) yield Promise[Int]

    countDownFuture.foreach { cdf =>
      cdf.onSuccess { case waitMillSec => {
        val index = indexHolder.getAndIncrement
        if (index < countDownPromise.length) { // これでcountFuture以下におさえる
          countDownPromise(index).success(waitMillSec)
        }
      } }
    }
    countDownPromise.foreach{ cdp => cdp.future.onSuccess { case waitMillSec => {
      println(s"wait time.. ${waitMillSec}")
    } } }

    Thread.sleep(5000)
  }
}

