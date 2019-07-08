var months = List("Horace", "Velmont")

months.map(x => x.toUpperCase)

months.map(x => x.toUpperCase).map(x => x.substring(0, 3))

class Phone(val name: String, val models: List[String])

val apple = new Phone("Apple", List("Iphone X", "IPHONE 8"))
val google = new Phone("Google", List("Pixel 2 XL", "Pixel 2"))
val samsung = new Phone("Samsung", List("GaS8", "GaS10E"))

val phoneList = List(apple, google, samsung)
phoneList.map(phone => phone.models)

phoneList.flatMap(phone => phone.models)

val isFactorOfThree = (input: Int) => if ((input / 3.0).isWhole) Some(input) else None

List.range(1,11).map(list=>isFactorOfThree(list))

List.range(1,11).flatMap(list => isFactorOfThree(list))