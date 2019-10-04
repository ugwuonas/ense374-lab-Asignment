public class ListElement
{
	private ListElement next;
	private ListElement previous;
	private int data;
	
	public ListElement()
	{
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void addElement(ListElement le)
	{ 
	 /* ListElement temp = new ListElement(le.getData());

        temp.setData(next);*/
		
		if (headnode == null )
		{
			headnode = le;
			return;
		}

       while (temp.getData()!= null)

      
	 
	}
	
	public ListElement getElement(int index)
	{
	if (index <= 0)
		return null;
	ListElement currentNode = ;
	for(int i = 1; i <= index; i++)
	{
		currentNode = currentNode.getData();
	}
	return currentNode;
	}
	
	
	public ListElement deleteElement (int index)
	{
		
	if (index <= 0)
		return null;
	ListElement currentNode = ;
	for (int i = 0; i < index - 2; i++)
	{
		currentNode = currentNode.getData();
	}
	currentNode.setData();
	
	}

	
	
/*	public void printLinkedListTail()
	{
	
	}*/
	
	
	public void printLinkedListHead()
	{
			System.out.println(" LinkedList: ");
		ListElement currentNode = head;
		if (head == null)
		{
			return;
		}
		else
		{
			while (currentNode != null) 
			{
				System.out.println(currentNode.getData() + "");
			currentNode = currentNode.next;
			}
		}
	}
	
	
	public static void main(string[] args)
{
ListElement le = new ListElement();
le.setData(5);

}
	
}	

*/
