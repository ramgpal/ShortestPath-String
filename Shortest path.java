//Given A route containing 4 direction (E,W,N,S) find the shortest path to reach the destination. "WNEENESENNN"
public class Main
{
	public static double Shortest_Path(String path) {
	    int x=0,y=0;
	    for(int i=0;i<path.length();i++) {
	        char dir=path.charAt(i);
	        //south
	        if (dir=='S') {
	            y--;
	        }
	        //north
	        else if(dir=='N') {
	            y++;
	        }
	        //east
	        else if(dir=='E') {
	            x++;
	        }
	        else {
	        x--;
	        }
	        
	    }
	    int y2=y*y;
	    int x2=x*x;
	    return ((double)Math.sqrt(x2+y2));
	}
	public static void main(String[] args) {
		String path="WNEENESENNN";
	System.out.println(Shortest_Path(path));
} }
