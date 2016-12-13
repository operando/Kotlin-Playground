fun run() {
    val java = JavaJava()
    println(java.list) // (Mutable)List<T>!

    // JavaからKotlinへ不変なListであることは伝えられない??
//    java.unmodifiableList.add("") // UnsupportedOperationException

    // @NullableをつけることでPlatform TypesじゃなくてKotlin typesになる
    println(java.nullableObject?.toUpperCase())

    // @NotNullをつけることでPlatform TypesじゃなくてKotlin typesになる
    println(java.notNullableObject.toUpperCase())

    // String?とかになってほしい...
    java.stringOptional.ifPresent { println(it) }

    val array = intArrayOf(1, 2, 3, 4)
    val i = 1
    if (i in array.indices) { // same as (i >= 0 && i < array.size)
        print(array[i])
    }

    java.arguments(*array)
}