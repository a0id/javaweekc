package dataStructures;

public class Node {
	private Object object;
	private Node link;
	public Node(Object objType) {
		object = objType;
		link = null;
	}
	public Object getObj() {
		return object;
	}
	public void setObj(Object obj) {
		object = obj;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node newLink) {
		link = newLink;
	}
}
