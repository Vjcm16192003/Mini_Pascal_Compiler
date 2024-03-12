import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionProcessor {
    List<Expression> list;
    public Map<String,Integer> values;

    public ExpressionProcessor(List<Expression> list){
        this.list=list;

        values = new HashMap<>();
    }
    public List<String> getEvaluationResults(){
        List<String> evaluations = new ArrayList<>();

        for(Expression e: list){
            if(e instanceof VariableDeclaration){
                VariableDeclaration declaration = (VariableDeclaration) e;
                values.put(declaration.id,declaration.value);

            }else {
                String input = e.toString();
                int result = getEvaluationResult(e);
                evaluations.add(input+" es "+result);
            }
        }
        return evaluations;
    }
    private int getEvaluationResult(Expression e){
        int result = 0;

        if(e instanceof Number number){
            result = number.num;
        } else if (e instanceof Variable var) {
            result = values.get(var.id);
        } else if (e instanceof Addition add) {
            int left  = getEvaluationResult(add.left);
            int right  = getEvaluationResult(add.right);
            result = left + right;
        }else {
            Multiplication mult = (Multiplication) e;
            int left  = getEvaluationResult(mult.left);
            int right  = getEvaluationResult(mult.right);
            result = left * right;
        }


        return result;
    }
}
