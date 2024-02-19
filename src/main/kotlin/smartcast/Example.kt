package smartcast

object Example {
    fun petSound(pet: Any) =
        when (pet){
            is Cat -> pet.meow()
            is Dog -> pet.bark()
            else -> println("Weird animal")
        }

}