package Treesets;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		ArrayList<String> ad = new ArrayList<String>();
		ad.add("ramn");
		ad.add("Sreesu");
		TreeSet<String> tr = new TreeSet<String>(ad);
		TreeSet<String> tree = new TreeSet<String>();
		tree.add("srisa");
		tree.add("ranga");
		tree.add("ramanujam");
		tree.add("Z");
		System.out.println(tree);
		System.out.println(tr);
		tr.addAll(tree);
		System.out.println(tr);
		// TODO Auto-generated method stub

	}

}
