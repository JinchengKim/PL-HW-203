package HW1;

/**
 * Created by lijin on 4/19/19.
 */
class IntExp extends Exp{
    private int val;
    IntExp(int val){this.val = val;}

    @Override
    public int eval() {
        return this.val;
    }
}
