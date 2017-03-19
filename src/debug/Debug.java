package debug;

public class Debug {

	/* DebugS ... Printing [S]uccessfull routines with return true
	 * DebugE ... Printin ([E]rror) Failed routines with return false*/
	
	public boolean DebugS(String debugmsg){		
		System.out.println("#Debug: "+debugmsg);
		return true;
	}	
	
	public boolean DebugE(String debugmsg){
		System.err.println("#ERROR: " +debugmsg);
		return false;
	}
}
