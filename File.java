package file2657488;

public class File implements Component {

	private String name;
	private int size;

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String display(String prefix) {
		return name + " (" + size + ")";
	}

	@Override
	public Component search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCount() {
		return 1;
	}

}
