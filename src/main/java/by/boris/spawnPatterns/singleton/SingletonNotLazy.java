package by.boris.spawnPatterns.singleton;
/** Пример (не ленивой инициализации) Singleton. (Потокобезопасный) */

public class SingletonNotLazy {
    public static final SingletonNotLazy instance = new SingletonNotLazy();
}
