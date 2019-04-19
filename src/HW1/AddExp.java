package HW1;

/**
 * Created by lijin on 4/19/19.
 */
class AddExp extends Exp {
    private Exp e1, e2;
    AddExp(Exp e1, Exp e2){this.e1 = e1; this.e2 = e2;}

    @Override
    public int eval() {
        return this.e1.eval() + this.e2.eval();
    }
}
