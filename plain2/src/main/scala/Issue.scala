object Issue {

  trait X[A] {
    def f(a: A): Int
  }

  implicit def derive[A: X, B: X] = new X[(A, B)] {
    override def f(a: (A, B)): Int = ???
  }

}
