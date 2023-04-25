import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


public class DomParser {
    public static void main(String[] args) {

        try {
            // Load the XML file into a document object
            File inputFile = new File("src/book.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            // Add a new "Book" node to the document
            Element newBook = doc.createElement("Book");
            Element newTitle = doc.createElement("title");
            newTitle.appendChild(doc.createTextNode("The Lord of the Rings"));
            Element newYear = doc.createElement("publishedYear");
            newYear.appendChild(doc.createTextNode("1954"));
            Element newPages = doc.createElement("numberOfPages");
            newPages.appendChild(doc.createTextNode("1178"));
            Element newAuthors = doc.createElement("authors");
            newAuthors.appendChild(doc.createTextNode("J.R.R. Tolkien"));
            newBook.appendChild(newTitle);
            newBook.appendChild(newYear);
            newBook.appendChild(newPages);
            newBook.appendChild(newAuthors);
            doc.getDocumentElement().appendChild(newBook);

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            // Get a list of all the "Book" nodes
            NodeList nList = doc.getElementsByTagName("Book");
            System.out.println("----------------------------");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                System.out.println("\nCurrent Element: " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Title: " + eElement.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Published Year: " + eElement.getElementsByTagName("publishedYear").item(0).getTextContent());
                    System.out.println("Number of Pages: " + eElement.getElementsByTagName("numberOfPages").item(0).getTextContent());
                    System.out.println("Author: " + eElement.getElementsByTagName("authors").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
