// 第03講 ユーザ定義型 例題3-1, 2, 3 ユーザ定義の型を定義する
// https://ksuap.github.io/2022autumn/lesson03/owntype/#ユーザ定義の型を定義する
import java.util.ArrayList;

public class PersonManager {
    void run() {
        Person person1 = this.createPerson("Haruaki", "Tamada");

        Person person2 = createPerson("名前", "自分の");

        Person person3 = person1;
        person3.familyName = person3.familyName.toUpperCase(); // <= person3 の値を更新する．

        ArrayList<Person> list = new ArrayList<>();
        printPersons(list);
    }

    Person createPerson(String name1, String name2) {
        Person person = new Person();
        person.givenName = name1;
        person.familyName = name2;
        return person;
    }

    void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.printf("%s, %s%n",
                    person.familyName, person.givenName);
        }
    }

    public static void main(String[] args) {
        PersonManager app = new PersonManager();
        app.run();
    }
}
