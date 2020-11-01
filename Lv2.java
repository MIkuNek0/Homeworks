import java.util.Scanner;

public class Lv2 {

    public static class Player {   //玩家
        String Name;
        int HP;
        int Attack;
        int Defence;

    }

    public static class Monster {  //怪兽
        String Name;
        int HP;
        int Attack;

    }

    public static int atk(int a,int b) {   //攻击(a为自身攻击，b为对手防御)
        double random = Math.floor(Math.random()*a);
        a = a/2 + (int)random - b;
        if (a < 0) a = 0;
        return a;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入玩家名字：");
        String name = scanner.next();
        System.out.println("请输入玩家体力：");
        int hp = scanner.nextInt();
        System.out.println("请输入玩家攻击：");
        int atk = scanner.nextInt();
        System.out.println("请输入玩家防御：");
        int def = scanner.nextInt();
        Player xd = new Player();
        xd.Name = name;
        xd.HP = hp;
        xd.Attack = atk;
        xd.Defence = def;

        System.out.println("请输入怪兽名字：");
        name = scanner.next();
        System.out.println("请输入怪兽体力：");
        hp= scanner.nextInt();
        System.out.println("请输入怪兽攻击：");
        atk = scanner.nextInt();
        Monster bug = new Monster();
        bug.Name = name;
        bug.HP = hp;
        bug.Attack = atk;

        System.out.println("玩家属性：");
        System.out.printf("%s HP-%d ATK-%d DEF-%d\n",xd.Name,xd.HP,xd.Attack,xd.Defence);
        System.out.println("怪兽属性：");
        System.out.printf("%s HP-%d ATK-%d\n",bug.Name,bug.HP,bug.Attack);
        System.out.println();
        System.out.println(">>>战斗开始<<<");
        boolean continuous;
        for (int i = 0; i < 10; i++) {
            bug.HP -= atk(xd.Attack,0);
            if (bug.HP <= 0){
                System.out.println("战斗胜利");
                continuous = true;
                break;
            }
            xd.HP -= atk(bug.Attack,xd.Defence);
            if (xd.HP <= 0){
                System.out.println("战斗失败");
                continuous = false;
                break;
            }
            System.out.println("玩家属性：");
            System.out.printf("%s HP-%d ATK-%d DEF-%d\n",xd.Name,xd.HP,xd.Attack,xd.Defence);
            System.out.println("怪兽属性：");
            System.out.printf("%s HP-%d ATK-%d\n",bug.Name,bug.HP,bug.Attack);
        }
        System.out.println("玩家属性：");
        System.out.printf("Name-%s HP-%d ATK-%d DEF-%d\n",xd.Name,xd.HP,xd.Attack,xd.Defence);
        System.out.println("怪兽属性：");
        System.out.printf("Name-%s HP-%d ATK-%d\n",bug.Name,bug.HP,bug.Attack);
    }
}
