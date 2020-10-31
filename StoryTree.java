package main;

public class StoryTree {
	private StoryNode root;
	
	public StoryNode getRoot() { return root; }
	public StoryTree(StoryNode r)
	{
		root = r;
	}
	public StoryTree()
	{
		root = null;
	}
}
