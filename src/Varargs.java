public class Varargs {
    static int sum(int ...arr)
    {
        int result=0;
        for(int element:arr)
        {
            result+=element;
        }
        return  result;
    }
}
