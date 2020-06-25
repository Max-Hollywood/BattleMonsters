package system;

// TODO: add slagging

/**
 * My way of logging is "  [CLASS/OBJECT/METHOD] > variable: value".
 */
public class Logging
{
	/**
	 * My way of logging.  Prints a single variable.
	 *
	 * @param obj
	 */
	public static void Slog(Object caller, String variable, Object obj)
	{
		
		System.out.println("  [" + formatCaller(caller) + "] > " + variable + ": " + obj);
	}
	
	/**
	 * My way of logging.  Prints an array of variables.
	 *
	 * @param obj
	 */
	public static void Slag(Object caller, String variable, Object[] obj)
	{
		for (int i = 0; i < obj.length; i++)
		{
			System.out.println("  [" + formatCaller(caller) + "] > " + variable + ": " + obj[i]);
		}
	}
	
	/**
	 * My way of logging.  Formats the default Java object `toString` method to remove the hash.
	 *
	 * @param caller
	 * @return
	 */
	public static String formatCaller(Object caller)
	{
		
		return caller.toString().substring(0, caller.toString().indexOf("@")).toUpperCase();
	}
}