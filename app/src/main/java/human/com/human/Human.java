package human.com.human;

import android.util.Log;

public class Human extends Animal implements Thinkable{
    String name;  // 名前
    int age;    // 年齢
    String hobby;
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say() {
        Log.d("test",  "「私の名前は" + this.name + "です。」" + "「年は" + this.age + "歳です。」");
    }
    public void think() {
        Log.d("test",  "「私は" + this.hobby + "について考える」");
    }
}
