//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {
        //1.勇者を生成
        Hero h = new Hero();
        //2.フィールドに初期値をセット
        h.name = "ミナト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp= 50;
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
    }
}