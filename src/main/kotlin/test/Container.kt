package test

class Container<T>(val value: T) {
}

// Javaで書く T extends Collection<String>
class Container2<T : Collection<String>>(val value: T) {
}

class Container3<T>(val value: T)  where T : Collection<String>, T : List<String> {
}

interface A {
}

interface B {
}

class Container4<T>(val value: T)  where T : A, T : B {
}

class Container5<T>(var value: T) {
    fun copyTo(to: Container5<in T>) {
        to.value = value
    }
}

class Container6<out T>(val value: T) {
}