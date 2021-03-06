package MyQueue_Stack_Array;

import java.util.NoSuchElementException;

class MyStack01<T> {
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> last;

	public T pop() {
		if (last == null) {
			throw new NoSuchElementException("pop 실패");
		}
		T data = last.data;
		last = last.next;

		return data;
	}

	public void push(T data) {
		Node<T> stack = new Node(data);

		stack.next = last;
		last = stack;
	}

	public T peek() {
		if (last == null) {
			throw new NoSuchElementException("peek 실패");
		}
		return last.data;
	}

	public boolean isEmpty() {
		return last == null;
	}
}

public class StackEx01 {

	public static void main(String[] args) {
		// stack

		MyStack01<Integer> stack = new MyStack01();

		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		while (!stack.isEmpty()) {
			System.out.println(stack.peek() + " / " + stack.pop() + " / " + stack.isEmpty());
		}
	}
}
