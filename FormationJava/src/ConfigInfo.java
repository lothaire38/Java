
public class ConfigInfo
{
	private static ConfigInfo instance;
	
	private ConfigInfo(){}

	public static  ConfigInfo getInstance()
	{
		if (instance == null)
		{
			instance = new ConfigInfo();
		}		
		return instance;
	}
	
//	public static getIns
	
}
