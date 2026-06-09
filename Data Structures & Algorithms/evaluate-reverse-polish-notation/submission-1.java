class Solution {
    public int evalRPN(String[] tokens) {
        String operators="+-/*";
        Stack<String>nums=new Stack<>();
        for(String s:tokens){
            if(operators.contains(s)){
                int num1=Integer.parseInt(nums.pop());
                int num2=Integer.parseInt(nums.pop());
                String temp;
                switch(s){
                    case "+":
                        temp=String.valueOf(num1+num2);
                        nums.push(temp);
                        break;
                    case "-":
                        temp=String.valueOf(num2-num1);
                        nums.push(temp);
                        break;
                    case "*":
                        temp=String.valueOf(num1*num2);
                        nums.push(temp);
                        break;
                    case "/":
                        temp=String.valueOf(num2/num1);
                        nums.push(temp);
                        break;
                }
            }
            else{
                nums.push(s);
            }
        }
        return Integer.parseInt(nums.pop());
    }
}
