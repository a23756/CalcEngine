public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double results;

    public MathEquation (char opCode){
        this.opCode = opCode;
    }

    public MathEquation(){

    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute (double leftVal, double  rightVal){
        this.rightVal = leftVal;
        this.leftVal = rightVal;

        execute();
    }

    public void execute (int leftVal,int rightVal){
        this.rightVal = leftVal;
        this.leftVal = rightVal;

        execute();
        results = (int)results;
    }

    public double getLeftVal(){
        return leftVal;
    }

    public void setLeftVal(double leftVal){
        this.leftVal = leftVal;
    }

    public double getRightVal() {
        return rightVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public char getOpCode() {
        return opCode;
    }

    public void setResults(double results){
        this.results = results;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public double getResults() {
        return results;
    }

    public void execute() {

        switch (opCode) {
            case 'a':
                results = leftVal + rightVal;
                break;
            case 's':
                results = leftVal - rightVal;
                break;
            case 'd':
                results = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            case 'm':
                results = leftVal * rightVal;
                break;
                default:
                    System.out.println("Invalid operator");
        }
    }
}
