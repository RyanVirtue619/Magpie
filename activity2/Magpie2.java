package activity2;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *             Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting     
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String trimStatement = statement.trim();
        String response = "";
        if (trimStatement.length() > 0) {
            if (statement.indexOf("no") >= 0)
            {
                response = "Why so negative?";
            }
            else if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0)
            {
                response = "Tell me more about your family.";
            }
            else if (statement.indexOf("dog") >= 0 
            || statement.indexOf("cat") >= 0)
            {
                response = "Tell me more about your pets.";
            }
            else if (statement.indexOf("Mr. Jaffe") >= 0) 
            {
                response = "Mr jaffe sounds like da goat teacher ong fr fr";
            }
            else if (statement.indexOf("Hello") >= 0)
            {
                response = "What is popping my good sir, how are you doing?";
            }
            else if (statement.indexOf("Mrs. Frerichs") >= 0) 
            {
                response = "GG go next good luck next year";
            }
            else if (statement.indexOf("Patrick Henry Highschool") >= 0
                    || statement.indexOf("PHHS") >=0)
            {
                response = "I love that school, it is the best highschool in San Diego California USA Earth. Who is your favorite teacher here?";
            }
            else if (statement.indexOf("Mr") >= 0
                    || statement.indexOf("Mrs") >= 0
                    || statement.indexOf("mr") >= 0
                    || statement.indexOf("mrs") >=0)
            {
                response = "Wow! What a great teacher";
            }
            else
            {
                response = getRandomResponse();
            }
        } else {
            response = "Please enter a valid response";
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "For real bro";
        }
        else if (whichResponse == 5) 
        {
            response = "Go on";    
        }

        return response;
    }
}
