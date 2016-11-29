package test;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

class TestClass {

	public static String getAString(Object foo) {
		if (foo instanceof List) {
			return "list";
		} else if (foo instanceof Collection) {
			if (foo instanceof Set) {
				return "set";
			} else if (foo instanceof SortedSet) {
				return "sorted set";
			} else if (foo instanceof LinkedList) {
				return "linked list";
			} else {
				return "collection";
			}
		} else {
			return "???";
		}
	}

}
