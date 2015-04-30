package euler;

public class Stack {

	static int[] stack = new int[2];
	static int stackSize = 0;

	public static void push(int i) {
		if (stackSize == stack.length) {
			int[] stackDouble = new int[stack.length * 2];
			for (int j = 0; j < stack.length; j++) {
				stackDouble[j] = stack[j];
			}
			stack = stackDouble;
			System.out.println("stack overflow. Size doubled to: "
					+ stack.length);
		}
		stack[stackSize++] = i;
	}

	public static int pop() {
		int result = stack[stackSize - 1];
		stack[--stackSize] = 0;
		return result;
	}

	public static void main(String[] args) {
		push(1);
		push(3);
		push(4);
		for (int x : stack) {
			System.out.println(x);
		}
		System.out.println("pop element: " + pop());
		for (int x : stack) {
			System.out.println(x);
		}
	}

}
