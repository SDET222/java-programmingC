package repl_it.methods;

public class ValidateTask {
    public static void main(String[] args) {

        System.out.println(validateTask(true,5,1));

    }
    public static boolean validateTask(boolean notEmpty,int taskId,int currentId) {
        if (notEmpty && taskId==currentId+1) {
            return true;
        } else {
            return false;
        }
    }

}
