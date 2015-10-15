
public class Singleton
{
	// --------------------------------------------------------------------
	//	Attribut
	private static Singleton instance;	
	// --------------------------------------------------------------------
	// Interdit l'instanciation � l'exterieur
	private Singleton(){}
	// --------------------------------------------------------------------
	// factory => Une methode qui cr�e une instance
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
