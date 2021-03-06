	import java.util.Deque;
	import java.util.LinkedList;

	public class DontPanic {


		static String removeString(String coordinates, int remove) {
			int len = coordinates.length();
		    int k = len - remove;
		 
		    Deque<Character> dq = new LinkedList<>() ;
		    String res = "";
		 
		    int i;
		    for (i=0; i<=len-k; i++) {
		    	 if (dq.isEmpty())
			  	        dq.add(coordinates.charAt(i));
			  	 
			  	    else
			  	    {
			  	        char temp = dq.getLast();
			  	 
			  	        // Keep removing digits larger than current digit
			  	        // from the back side of deque
			  	        while( temp > coordinates.charAt(i) && !dq.isEmpty())
			  	        {
			  	            dq.removeLast();
			  	            if (!dq.isEmpty())
			  	                temp = dq.getLast();
			  	        }
			  	        dq.add(coordinates.charAt(i)); // insert the current digit
			  	    }
		    }
		    while (i < len)
		    {
		        res += dq.peek();
		        dq.pop();

		        if (dq.isEmpty())
		  	        dq.add(coordinates.charAt(i));
		  	 
		  	    else
		  	    {
		  	        char temp = dq.getLast();
		  	        while( temp > coordinates.charAt(i) && !dq.isEmpty())
		  	        {
		  	            dq.removeLast();
		  	            if (!dq.isEmpty())
		  	                temp = dq.getLast();
		  	        }
		  	        dq.add(coordinates.charAt(i));
		  	    }
		        i++;
		    }
		    res += dq.peek();
		    dq.pop();
		    return res;
		}

			
		
		public static void main(String [] args) {
			System.out.println(removeString("431225",5));
		}

}
