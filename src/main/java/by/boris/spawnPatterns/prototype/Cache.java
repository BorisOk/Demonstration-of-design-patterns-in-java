package by.boris.spawnPatterns.prototype;
public class Cache {
    Person person;

    public Person getPerson() throws CloneNotSupportedException {
        return person.clone();
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
