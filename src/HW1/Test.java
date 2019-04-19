package HW1;

/**
 * Created by lijin on 4/19/19.
 */
public class Test {
    public static void main(String[] args) {
        // write your code here
        // 1 eval => 1
        // 1 + 2 - 1 eval => 2
        IntExp num_neg1 = new IntExp(-1);

        IntExp num_1 = new IntExp(1);
        IntExp num_2 = new IntExp(2);
        IntExp num_3 = new IntExp(3);
        IntExp num_4 = new IntExp(4);

        // 1 eval => 1
        assert (num_1.eval() == 1);
        // -1 eval => -1
        assert (num_neg1.eval() == -1);
        // 1+1 eval => 2
        assert (new AddExp(num_1,num_1).eval() == 2);
        // 1 + 2 * 3 => 7
        assert ( new AddExp(num_1, new MulExp(num_2, num_3)).eval() == 7);
        // 1 * 2 + 3 => 5
        assert (new AddExp(new MulExp(num_1, num_2), num_3).eval() == 5);
        // new feature
        // 1-1 eval => 0
        assert (new SubExp(num_1,num_1).eval() == 0);
        // 1 + 2 * 3 - 4 eval => 3
        assert (new AddExp(num_1, new SubExp(new MulExp(num_2, num_3), num_4)).eval() == 3);
        System.out.println(56 % -3);
    }
}
