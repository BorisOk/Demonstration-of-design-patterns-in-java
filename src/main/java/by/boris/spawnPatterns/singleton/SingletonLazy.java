package by.boris.spawnPatterns.singleton;
/** Паттерн Singleton (одиночка) - это паттерн который гарантирует что у класса есть только
    один обьект (один экземпляр класса). И к этому обьекту предостовляется глобальная точка доступа.
    Ленивая инициализация - это когда создание обьекта выполняется по требованию а не заблаговременно.
    Он потоконебезопасный, но если добавить synchronized будет потокобезопасный. */

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    // сюда можно добавить synchronized для потока безопасности
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public void print() {
        System.out.println(this);
    }
}