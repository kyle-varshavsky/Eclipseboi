package mUiciow2L1;

class Player {
	private String name;
	private int size;

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;

	}

	public void setSize(int s) {
		if (s < 1) {
			s = 1;
		} else if (s > 1000) {
			s = 1000;
		}
		size = s;
	
	public Player() {
		System.out.println("Creating Object...");
		name = "Default";
		size = 1;
	}
	}
}
