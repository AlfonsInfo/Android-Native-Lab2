package Idioms



fun main() {

    //lazy -> val
    val p : String by lazy {
        "Idioms.Data"
    }
    val user : Data by lazy {
        Data("alfons", 20)
    }

    print(p)
}

class Data(var nama : String, var umur : Int)


//https://stackoverflow.com/questions/36623177/property-initialization-using-by-lazy-vs-lateinit
//next when, ranges, null check

//Here are the significant differences between lateinit var and by lazy { ... } delegated property:
//
//lazy { ... } delegate can only be used for val properties, whereas lateinit can only be applied to vars,
// because it can't be compiled to a final field, thus no immutability can be guaranteed;
//
//lateinit var has a backing field which stores the value, and by lazy { ... } creates a
// delegate object in which the value is stored once calculated, stores the reference to the delegate
// instance in the class object and generates the getter for the property that works with the delegate instance.
// So if you need the backing field present in the class, use lateinit;
//
//In addition to vals, lateinit cannot be used for nullable properties or Java primitive types (this is because of null used for uninitialized value);
//
//lateinit var can be initialized from anywhere the object is seen from, e.g. from inside a framework code, and multiple initialization scenarios are possible for different objects of a single class. by lazy { ... }, in turn, defines the only initializer for the property, which can be altered only by overriding the property in a subclass. If you want your property to be initialized from outside in a way probably unknown beforehand, use lateinit.
//
//Initialization by lazy { ... } is thread-safe by default and guarantees that the initializer is invoked at most once (but this can be altered by using another lazy overload). In the case of lateinit var, it's up to the user's code to initialize the property correctly in multi-threaded environments.
//
//A Lazy instance can be saved, passed around and even used for multiple properties. On contrary, lateinit vars do not store any additional runtime state (only null in the field for uninitialized value).
//
//If you hold a reference to an instance of Lazy, isInitialized() allows you to check whether it has already been initialized (and you can obtain such instance with reflection from a delegated property). To check whether a lateinit property has been initialized, you can use property::isInitialized since Kotlin 1.2.
//
//A lambda passed to by lazy { ... } may capture references from the context where it is used into its closure.. It will then store the references and release them only once the property has been initialized. This may lead to object hierarchies, such as Android activities, not being released for too long (or ever, if the property remains accessible and is never accessed), so you should be careful about what you use inside the initializer lambda.
//
//Also, there's another way not mentioned in the question: Delegates.notNull(), which is suitable for deferred initialization of non-null properties, including those of Java primitive types.


