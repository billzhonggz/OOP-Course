package assignment1;
//Refers to 
//http://java.globinch.com/java-quick-tips/performance-string-stringbuffer-stringbuilder-memory-runtime-analysis/.

public class Question3
{
	//Two unit conversations. Use KB in this case.
	//private static final int MBinBytes = 1048576;
	private static final int KBinBytes = 1024;
	
	public Question3()
	{
		//A default constructor.
		;
	}
	
	//Run garbage collector.
	private void performGC()
	{
		for (int i = 0; i < 10; i++)
		{
			System.gc();
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}
		}
	}
	
	//Get memory used value.
	private long memoryUsed()
	{
		return ((Runtime.getRuntime().totalMemory() / KBinBytes) - (Runtime.getRuntime().freeMemory() / KBinBytes));
	}
	
	//Main test method for String.
	public void testStringMemory()
	{
		//Print initial memory.
		System.out.println("Initial total memory in JVM in KBs = " + Runtime.getRuntime().totalMemory() / KBinBytes);
		System.out.println("Initial free memory in JVM in KBs = " + Runtime.getRuntime().freeMemory() / KBinBytes);
		//Get initial memory usage and time.
		long initialMemory = memoryUsed();
		long startTime = System.currentTimeMillis();
		//Initialize test string.
		String s = "";
		//Set up a big loop to test run.
		for (int i = 1; i < 50000; i++)
		{
			s = s + i;
		}
		//Get finish time and compute time usage.
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time taken to complete the process in MilliSeconds: " + elapsedTime);
		System.out.println("Memory used by String in KBs = " + (memoryUsed() - initialMemory));
		s = null;
		//Run garbage collector.
		performGC();
		System.out.println("Free memory after GC in KBs=" + Runtime.getRuntime().freeMemory() / KBinBytes);
	}
	
	//Main test method for StringBuilder.
	public void testStringBuilderMemory()
	{
		//Print initial memory.
		System.out.println("Initial total memory in JVM in KBs = " + Runtime.getRuntime().totalMemory() / KBinBytes);
		System.out.println("Initial free memory in JVM in KBs = " + Runtime.getRuntime().freeMemory() / KBinBytes);
		//Get initial memory usage and time.
		long initialMemory = memoryUsed();
		long startTime = System.currentTimeMillis();
		//Initialize test string.
		StringBuilder s = new StringBuilder();
		//Set up a big loop to test run.
		for (int i = 1; i < 50000; i++)
		{
			s.append(i);
		}
		//Get finish time and compute time usage.
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time taken to complete the process in MilliSeconds: " + elapsedTime);
		System.out.println("Memory used by StringBuilder in KBs = " + (memoryUsed() - initialMemory));
		s = null;
		//Run garbage collector.
		performGC();
		System.out.println("Free memory after GC in KBs=" + Runtime.getRuntime().freeMemory() / KBinBytes);
	}
	
	//Main test method for StringBuffer.
	public void testStringBufferMemory()
	{
		//Print initial memory.
		System.out.println("Initial total memory in JVM in KBs = " + Runtime.getRuntime().totalMemory() / KBinBytes);
		System.out.println("Initial free memory in JVM in KBs = " + Runtime.getRuntime().freeMemory() / KBinBytes);
		//Get initial memory usage and time.
		long initialMemory = memoryUsed();
		long startTime = System.currentTimeMillis();
		//Initialize test string.
		StringBuffer s = new StringBuffer();
		//Set up a big loop to test run.
		for (int i = 1; i < 50000; i++)
		{
			s.append(i);
		}
		//Get finish time and compute time usage.
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time taken to complete the process in MilliSeconds: " + elapsedTime);
		System.out.println("Memory used by StringBuffer in KBs = " + (memoryUsed() - initialMemory));
		s = null;
		//Run garbage collector.
		performGC();
		System.out.println("Free memory after GC in KBs=" + Runtime.getRuntime().freeMemory() / KBinBytes);
	}
	
	//The main method.
	public static void main (String[] args)
	{
		System.out.println("Initial max memory in JVM in KBs = " + Runtime.getRuntime().maxMemory() / KBinBytes);
		Question3 memoryTest = new Question3();
		System.out.println(" ........\nString memory test\n");
		memoryTest.testStringMemory();
		System.out.println("  ........\nStringBuffer memory test\n");
		memoryTest.testStringBufferMemory();
		System.out.println("  ........\nStringBuilder memory test\n");
		memoryTest.testStringBuilderMemory();
	}
}