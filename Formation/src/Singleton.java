
public class Singleton
{
	// --------------------------------------------------------------------
	//	Attribut
	private static Singleton instance;	
	// --------------------------------------------------------------------
	// Interdit l'instanciation à l'exterieur
	private Singleton(){}
	// --------------------------------------------------------------------
	// factory => Une methode qui crée une instance
	//	synchronized (permet que sur un seul thread)
	public static synchronized Singleton getInstance()
	{
		if (instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	// --------------------------------------------------------------------	
	
}
