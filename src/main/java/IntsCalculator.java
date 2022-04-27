public class IntsCalculator implements Ints {

    protected final Calculator.Formula formula;

    public IntsCalculator() {
        this.formula = new Calculator.Formula();
    }

    @Override
    public int sum(int arg0, int arg1) {
        formula.a = (double) arg0;
        formula.b = (double) arg1;
        return formula.calculate(Calculator.Operation.SUM).result.intValue();
    }

    @Override
    public int mult(int arg0, int arg1) {
        formula.a = (double) arg0;
        formula.b = (double) arg1;
        return formula.calculate(Calculator.Operation.MULT).result.intValue();
    }

    @Override
    public int pow(int a, int b) {
        formula.a = (double) a;
        formula.b = (double) b;
        return formula.calculate(Calculator.Operation.POW).result.intValue();
    }
}

