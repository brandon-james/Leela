package java.com.cloud3478.type.value;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ImList<T> {
	private final List<T> elements;

	@SafeVarargs
	private ImList(T... elements) {
		this.elements = new ArrayList<>(elements.length);
		for (T element : elements) {
			this.elements.add(element);
		}
	}

	private ImList(Collection<T> elements) {
		this.elements = new ArrayList<>(elements);
	}

	@SafeVarargs
	public static <T> ImList<T> of(T... elements) {
		return new ImList<>(elements);
	}

	public static <T> ImList<T> of(Collection<T> elements) {
		return new ImList<>(elements);
	}

	public T element(int index) {
		return elements.get(index);
	}

	public int length() {
		return elements.size();
	}

	public boolean contains(T element) {
		return elements.contains(element);
	}

	public int indexOf(T element) {
		return elements.indexOf(element);
	}
	
	public ImList<T> withAppended(final T element){
		final List<T> temp = new ArrayList<>(elements);
		temp.add(element);
		return ImList.of(temp);
	}
	
}
