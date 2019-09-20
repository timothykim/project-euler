def isPrime(n: Long): Boolean = {
  if (n <= 3) {
    n > 1
  } else if (n % 2 == 0 || n % 3 == 0) {
    false
  } else {
    var i: Long = 5
    while (i * i <= n) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false
      }
      i = i + 6
    }
    true
  }
}

var primes: List[Long] = List()
var n: Long = 1
val limit: Long = 2000000

while (n <= limit) {
  print(s"$n\r")

  if (isPrime(n)) {
    primes = n :: primes
  }
  n = n + 1
}

println(primes.sum)



