package adt;

public class Counter {

	private int counter = 0;
	private String name = null;

	public Counter(String str) {
		this.name = str;
	}

	public void increament() {
		this.counter++;
	}

	public int getCurrentValue() {
		return this.counter;
	}

	public String toString() {
		return name + ": " + counter;
	}

}
