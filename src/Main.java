public class Main {

    public static void main(String[] args) {
//        double [] leftVal = {100.0d, 25.0d, 225.0d, 11.0d};
//        double [] rightVal = {50.0d, 92.0d, 17.0d, 11.0d};
//        char [] opCodes = {'d', 'a', 's', 'm'};
//        double [] results = new double [opCodes.length];
//        double val1 = 100.0d;
//        double val2 = 50.0d;
//        double result;
//        char opCode = 'd';

//        MathEquation testEquation = new MathEquation();
//        testEquation.execute();
//        System.out.print("tests=");
//        System.out.println(testEquation.getResults());

        String[] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "add lol 92.0",
                "addxx lol 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();

        for (String statement : statements)
            try {
                helper.process(statement);
                System.out.println(helper);
            } catch (InvalidStatementException e) {
                System.out.println(e.getMessage());
                if (e.getCause() != null)
                    System.out.println("  Original exception: " + e.getCause().getMessage());
            }
    }
}
//    static void usingMathEquation(){
//        MathEquation[] equations = new MathEquation[4];
//        equations[0] = new MathEquation('k', 100.0d, 25.0d);
//        equations[1] = new MathEquation('s', 25.0d, 11.0d);
//        equations[2] = new MathEquation('d', 50.0d, 92.0d);
//        equations[3] = new MathEquation('m',  17.0d, 11.0d);
//
//        for (MathEquation equation : equations) {
//            equation.execute();
//            System.out.print("result = ");
//            System.out.println(equation.getResults());
//        }

//        double leftDouble = 9.0d;
//        double rightDouble = 4.0d;
//        int leftInt = 9;
//        int rightInt = 4;
//
//        System.out.println("Using Method Overloading");
//        MathEquation equationOverload = new MathEquation('d');
//        equationOverload.execute(leftDouble, rightDouble);
//        System.out.print("result == ");
//        System.out.println(equationOverload.getResults());
//
//        equationOverload.execute(leftInt, rightInt);
//        System.out.print("result == ");
//        System.out.println(equationOverload.getResults());
//
//        equationOverload.execute((double)leftInt, (double)rightInt);
//        System.out.print("result == ");
//        System.out.println(equationOverload.getResults());
//
//        System.out.println();
//        System.out.println("Ising Inheritance");
//        System.out.println();

//        CalculateBase[] calculators = {new Divider(10, 5),
//                new Adder(1, 1),
//                new Subtracter(6, 4),
//                new Multiplier(5, 2){
//                }};
//
//        for(CalculateBase calculator:calculators){
//            calculator.calculate();
//            System.out.print("Result = ");
//            System.out.println(calculator.getResult());
//        }
//    }

//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//
//        MathEquation equation = new MathEquation(opCode, leftVal,rightVal);
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//        return equation;
//
//}


