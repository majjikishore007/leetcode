class Solution {
    public boolean isValid(String s) {
       if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
				// System.out.println(stack);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				// System.out.println("helloo");
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				return false;
			}
		}
	
        
        return stack.isEmpty();
            
            
    }
}