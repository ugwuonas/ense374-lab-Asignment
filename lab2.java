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
	  ListElement temp = new ListElement(le.getData());

        temp.setData(next);

       

      
	 
	}
	
	public ListElement getElement(int index)
	{
	if (index)
	
	}
	
	
	public ListElement deleteElement (int index)
	{
	
	}

	
	
	public void printLinkedListTail()
	{
	
	}
	
	
	public void printLinkedListHead()
	{
	
	}
	*/
	
	
}	
public static void main()
{
ListElement le = new ListElement();
le.setData(5);

}

