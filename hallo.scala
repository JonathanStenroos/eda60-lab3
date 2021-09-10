object HelloWorld {
  def main(args: Array[String]): Unit = {
    val msg: String = "Hello, world" + "!";
    println(msg + "!!!");
    println("HEEEJDÅ" * (math.random() * 10).toInt);
  }
}
