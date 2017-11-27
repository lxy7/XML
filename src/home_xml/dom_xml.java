/**
 * 
 */
package home_xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Lxy E-mail:1466281805@qq.com
 * @version 创建时间：2017年10月13日下午5:57:27
 * 类说明
 */
public class dom_xml {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			
			DocumentBuilderFactory bdf = DocumentBuilderFactory.newInstance();//首先创建一个DocementBu
			DocumentBuilder db = bdf.newDocumentBuilder();//获得一个	DocumentBuilder对象
		    Document document = db.parse("book.xml");//DocumentBuilder的parse方法获取路径文件
			NodeList bl = document.getElementsByTagName("book");//获得xml文件内容
			System.out.println("一共有："+bl.getLength()+"本书");
			for(int i = 0; i < bl.getLength(); i++){
				System.out.println("*****开始对"+(i+1)+"本书进行遍历，获取他们的基本属性");
				Node b = (Node) bl.item(i);//通过item()方法对NodeList集合获取内容
			    Element b_da = (Element)bl.item(i);
			    String atrrid =b_da.getAttribute("id");
			    System.out.println("id的属性的值是："+atrrid);
			    String atrr_ty =b_da.getAttribute("type");
			    System.out.println("type的属性的值是："+atrr_ty);
		   
			    NodeList b_daList = b.getChildNodes();
			    //System.out.println("子节点的值是："+b_daList.getLength());
			   for (int k = 0; k < b_daList.getLength(); k++) {
				if(b_daList.item(k).getNodeType() == Node.ELEMENT_NODE)
				{
					System.out.println("节点名为：" + b_daList.item(k).getNodeName());
					System.out.println("节点值为：" + b_daList.item(k).getFirstChild().getNodeValue());
					
				}
				
			}
			System.out.println("结束遍历"+(i+1)+"本书的信息");	
			}	
				
		} catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
