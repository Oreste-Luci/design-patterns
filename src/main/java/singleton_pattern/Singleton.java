package singleton_pattern;

/**
 * @author Oreste Luci
 */
public class Singleton {

    private volatile static Singleton singletonInstance;

    // Private constructor so that it cannot be instantiated
    private Singleton() {}

    public Singleton getInstance() {

        if (singletonInstance == null) {
            // Making it thread safe
            synchronized (Singleton.class) {
                if (singletonInstance == null) {
                    singletonInstance = new Singleton();
                }
            }
        }

        return singletonInstance;
    }
}
