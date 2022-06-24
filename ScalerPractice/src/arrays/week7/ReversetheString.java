package arrays.week7;

public class ReversetheString {

	public static String solve(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder buf = new StringBuilder();
        
        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' ') buf.append(c);
            else create(res, buf);
        }
        
        create(res, buf);
        return res.toString();
    }
    
    private static void create(StringBuilder res, StringBuilder buf)
    {
        int i = buf.length()-1;
        
        while(i>=0){
            if(i==buf.length()-1 && res.length()>0) res.append(' ');
            res.append(buf.charAt(i));
            i--;
        }
        buf.setLength(0);
    }
    
	public static void main(String[] args) {
		String A = "sai the boss";
		String res = solve(A);
		System.out.println(res);
	}
}
