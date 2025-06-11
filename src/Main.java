//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        //chapter9
        Hero h1 = new Hero("ミナト");
        //h1.name = "ミナト";
        //h1.hp = 100;
        //Hero h2 = h1;
        //h2.hp = 200;
        System.out.println(h1.hp);
        System.out.println(h1.name);

        Hero h2 = new Hero();
        System.out.println(h2.name);


        /*
        //1.勇者を生成
        Hero h = new Hero("ミナト");
        //2.フィールドに初期値をセット
        //h.name = "ミナト";
        //h.hp = 100;

        Matango m1 = new Matango();
        m1.hp = 50;
        m1.suffix = 'A';

        Matango m2 = new Matango();
        m2.hp = 48;
        m2.suffix = 'B';

        //冒険のはじまり
        h.slip();
        m1.run();
        m2.run();
        h.run();
        System.out.println("勇者" + h.name + "を生み出しました!");
        //3.勇者のメソッドを呼び出してゆく
        h.sit(5);
        h.slip();
        h.sit(30);
        h.run();

        //chapter9
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;
        h.name = "ミナト";
        h.sword = s;
        System.out.println("現在の武器は" + h.sword.name);
*/

    }
}