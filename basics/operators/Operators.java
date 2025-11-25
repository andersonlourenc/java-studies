package basics.operators;

public class Operators {

    public static void main(String[] args)  {

        // --- Arithmetic
        
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        System.out.println(original_result + " % 3 = " + result);

        // --- Concat

        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);

        // --- Unary

        result = + 1;
        System.out.println(result); // 1

        result--;
        System.out.println(result); // 0

        result++;
        System.out.println(result); // 1

        result = -result;
        System.out.println(result); // -1

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);


        // --- PrePost
        int i = 3;
        ++i;     
        // prints 4
        System.out.println(i); // 4
        ++i;               
        
        System.out.println(i); // 5
        
        System.out.println(++i); // 6
        
        System.out.println(i++); // 6
        
        System.out.println(i); // 7


        // --- Relational

        int value1 = 1;
        int value2 = 2;

        if(value1 == value2)
            System.out.println("value1 == value2");
        if(value1 != value2)
            System.out.println("value1 != value2");
        if(value1 > value2)
            System.out.println("value1 > value2");
        if(value1 < value2)
            System.out.println("value1 < value2");
        if(value1 <= value2)
            System.out.println("value1 <= value2");

        // --- Conditional

        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        int res; 

        boolean someCondition = true;
        res = someCondition ? value1 : value2;

        System.out.println(res);


        


    }
}

