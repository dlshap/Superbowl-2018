package superbowl;

public class GameConstants {

	public static final int MAXSCORES = 10;		// scoregrid
	public static final int FILEREAD = 1;		// file mode: input file
	public static final int FILEWRITE = 2;		// file mode: output file
	public static final int HTMLTYPE = 1;		// file type: HTML
	public static final int CSVTYPE = 2;		// file type: CSV
	public static final int SORTBYNAME = 1;		// sort by name
	public static final int SORTBYSCORE = 2;	// sort by score
	
	public static String breakString() {
		switch (GameOptions.OUTPUTTYPE) {
		case GameConstants.CSVTYPE:
			return "\n";
		default:
			return "<br>";
		}
	}
}
