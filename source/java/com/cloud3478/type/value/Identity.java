package java.com.cloud3478.type.value;

public class Identity {
	private final String label;
	private final long id;

	public Identity(String label) {
		this.label = label;
		id = nextId();
	}

	public Identity(long id, String label) {
		this.label = label;
		this.id = id;
	}

	public String label() {
		return label;
	}

	public long id() {
		return id;
	}

	private static long lastId = 0;

	private static synchronized long nextId() {
		return lastId += 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Identity other = (Identity) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
