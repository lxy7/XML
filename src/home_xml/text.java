/**
 * 
 */
package home_xml;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;



/**
 * @author Lxy E-mail:1466281805@qq.com
 * @version 创建时间：2017年10月13日下午6:22:44
 * 类说明
 */
public class text {

	/**
	 * @param args
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		sax_xml sa = new sax_xml();
		parser.parse("book.xml", sa);

	}

}
