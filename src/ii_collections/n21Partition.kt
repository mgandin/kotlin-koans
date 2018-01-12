package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

    // Return customers who have more undelivered orders than delivered
//fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = this.customers.filter { it ->
//        val(delivered, undelivered) = it.orders.partition { it.isDelivered }
//        return@filter delivered.size < undelivered.size
//    }.toSet()
    fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> = this.customers.filter { it.hasUndeliveredORder()}.toSet()

fun Customer.hasUndeliveredORder() : Boolean {
    val (delivered, undelivered) = this.orders.partition { it.isDelivered }
    return delivered.size < undelivered.size
}
