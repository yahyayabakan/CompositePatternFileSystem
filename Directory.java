package file2657488;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Directory implements Component {

	private String name;
	private int size;
	private ArrayList<Component> filesAndDirectories = new ArrayList<Component>();

	public Directory(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public ArrayList<Component> getFilesAndDirectories() {
		return filesAndDirectories;
	}

	@Override
	public int getSize() {
		int total = 0;
		for (int i = 0; i < filesAndDirectories.size(); i++) {
			total += filesAndDirectories.get(i).getSize();
		}
		return total;
	}

	@Override
	public int getCount() {
		int count = 0;
		for (int i = 0; i < filesAndDirectories.size(); i++) {
			count++;
		}
		return count;
	}

	@Override
	public String display(String prefix) {
		String display = name + ": (count=" + getCount() + ", size=" + getSize() + ")";
		String part = "";
		for (int i = 0; i < filesAndDirectories.size(); i++) {
			part += "\n" + filesAndDirectories.get(i).display(prefix);
		}
		return display + adjustPart(part, prefix);
	}

	public String adjustPart(String part, String prefix) {
		Scanner input = new Scanner(part);
		String paragraph = "";
		while (input.hasNextLine()) {
			String sentence = input.nextLine();
			if (sentence.isBlank() == false)
				paragraph = paragraph + "\n" + prefix + sentence;
		}
		input.close();
		return paragraph;
	}

	@Override
	public Component search(String name) {
		for (int i = 0; i < filesAndDirectories.size(); i++) {
			if (filesAndDirectories.get(i) instanceof File) {
				if (filesAndDirectories.get(i).getName().equals(name)) {
					return this;
				}
			} else {
				Component component = filesAndDirectories.get(i).search(name);
				if (component != null)
					return component;
			}
		}
		return null;
	}

	public void add(Component component) {
		if (component != null)
			filesAndDirectories.add(component);
	}

	public void remove(Component component) {
		if (component != null)
			filesAndDirectories.remove(component);
	}

}
