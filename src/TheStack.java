import java.util.Arrays;

public class TheStack {
	private String[] stackArray;
	private int stackSize;
	private int topOfStack = -1;
	
	TheStack(int size)
	{
		stackSize = size;
		stackArray = new String[size];
		Arrays.fill(stackArray, "-1");
	}
	
	public void push(String input)
	{
		if((topOfStack+1)<stackSize)
		{
			topOfStack++;
			stackArray[topOfStack] = input;
			
		}
		else
		{
			System.out.println("There is no space for push String");
		}
	}
	
	public void pushMany(String multipleValues)
	{
		String[] tempString = multipleValues.split(" ");
		int length = tempString.length;
		if((topOfStack+length)<stackSize)
		{
			for(int i = 0; i < length; i++)
			{
				push(tempString[i]);
			}
			
		}
		else
		{
			System.out.println("There is no space for push String");
		}
	}
	
	public void pop()
	{
		if(topOfStack>=0)
		{
			display();
			System.out.println("Pop" + stackArray[topOfStack] + " was removed.");
			stackArray[topOfStack] = "-1";
			topOfStack--;
		}
		else
		{
			System.out.println("There is no item for pop String");
		}
	}
	
	public void popAll()
	{
		for(int i = topOfStack; i>=0; i--)
		{
			pop();
		}
	}
	
	public void display()
	{
		DisplayStack displayStack = new DisplayStack();
		displayStack.displayStack(stackArray,stackSize);
	}
	
	public static void main(String[] args)
	{
		TheStack theStack = new TheStack(10);
		theStack.pushMany("10 15 20 25 30");
		theStack.display();
		theStack.popAll();
	}
}
