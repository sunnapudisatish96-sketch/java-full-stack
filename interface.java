package sattishit;

public class Box<T> {
	private T value;

	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static void main(String[] args) {
		Box<String> Stringbox = new Box<>("Hello");
		System.out.println(Stringbox);
		Box<Integer> boxint = new Box<>(123);
		System.out.println(boxint);

	}
}