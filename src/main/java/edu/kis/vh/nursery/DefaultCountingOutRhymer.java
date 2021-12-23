package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static int MAX_NUMBER = 12;

	private static int INITIAL_CAPACITY = -1;

	private static int ERROR_CODE = -1;

	private int[] numbers = new int[MAX_NUMBER];

	private int total = INITIAL_CAPACITY;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public int getTotal() {
		return total;
	}

	public boolean callCheck() {
			return total == INITIAL_CAPACITY;
		}

	public boolean isFull() {
				return total == MAX_NUMBER - 1;
			}

	protected int peekaboo() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return ERROR_CODE;
		return numbers[total--];
		}
}
