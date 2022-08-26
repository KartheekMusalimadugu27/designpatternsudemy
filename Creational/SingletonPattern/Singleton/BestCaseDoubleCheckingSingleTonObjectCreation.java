// Double Checked Locking based Java implementation of
// singleton design pattern

//We have declared the obj volatile which ensures that 
//multiple threads offer the obj variable correctly when it 
//is being initialized to Singleton instance. This method 
//drastically reduces the overhead of calling the synchronized
//method every time.
//
class Singleton
{
	private static volatile Singleton obj = null;

	private Singleton() {}

	public static Singleton getInstance()
	{
		if (obj == null)
		{
			// To make thread safe
			synchronized (Singleton.class)
			{
				// check again as multiple threads
				// can reach above step
				if (obj==null)
					obj = new Singleton();
			}
		}
		return obj;
	}
}
