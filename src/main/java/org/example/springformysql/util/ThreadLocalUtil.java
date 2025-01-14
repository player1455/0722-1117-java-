package org.example.springformysql.util;

public class ThreadLocalUtil {

    private static final ThreadLocal threadLocal = new ThreadLocal();

    public static<T> T get() {
        return (T) threadLocal.get();
    }

    public static void set(Object value) {
        threadLocal.set(value);
    }

    public static void remove() {
        threadLocal.remove();
    }
}
