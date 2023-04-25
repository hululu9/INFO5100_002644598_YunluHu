import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {
            // Read the JSON file
            Object obj = parser.parse(new FileReader("src/book.json"));

            //Convert to a JSON object
            JSONObject jsonObj = (JSONObject) obj;

            // Get the "BookShelf" object and the "Book" array
            JSONObject bookShelfObj = (JSONObject) jsonObj.get("BookShelf");
            JSONArray booksArr = (JSONArray) bookShelfObj.get("Book");

            // Create a new book object
            JSONObject newBookObj = new JSONObject();
            newBookObj.put("title", "The Lord of the Rings");
            newBookObj.put("publishedYear", "1954");
            newBookObj.put("numberOfPages", "1178");
            newBookObj.put("authors", "J.R.R. Tolkien");

            // Add the new book object to the array
            booksArr.add(newBookObj);

            // For looping to get books to the books array
            for (int i = 0; i < booksArr.size(); i++) {
                JSONObject bookObj = (JSONObject) booksArr.get(i);
                String title = (String) bookObj.get("title");
                String publishedYear = (String) bookObj.get("publishedYear");
                String numberOfPages = (String) bookObj.get("numberOfPages");
                String authors = (String) bookObj.get("authors");

                System.out.println("\nBook");
                System.out.println("Title: " + title);
                System.out.println("Published Year: " + publishedYear);
                System.out.println("Number of Pages: " + numberOfPages);
                System.out.println("Authors: " + authors);
            }
        } catch(Exception e){
                e.printStackTrace();
        }
    }
}

