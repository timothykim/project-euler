def isPrime(n: Int) = {
  if (n <= 3) {
    return n > 1
  } else if (n % 2 == 0 || n % 3 == 0) {
    return false
  } else {
    var i = 5
    while (i * i <= n) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false
      }
      i = i + 6
    }
    return true
  }
}

var n = 2
var i = 0
val np = 10

while (i < np) {
  val ip = isPrime(n)
  if (ip) {
    i = i + 1
    println(i, n)
  }
  if (i == np) {
    System.exit(0)
  }
  n = n + 1
}


